package com.zhengsongjun.myTestAnswer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhengsongjun.myTestAnswer.AllGroup;
import com.zhengsongjun.myTestAnswer.Question;
import com.zhengsongjun.myTestAnswer.QuestionGroup;
import com.zhengsongjun.myTestAnswer.mapper.AnswerMapper;
import com.zhengsongjun.myTestAnswer.pojo.Answer;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetAnswerJson extends HttpServlet {
    public GetAnswerJson() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream(),"UTF-8"));
        StringBuilder sb = new StringBuilder();
        String inputStr;
        while((inputStr = bufferedReader.readLine()) != null) {
            sb.append(inputStr);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        AllGroup ob = objectMapper.readValue(sb.toString(), AllGroup.class);
        // 现在开始插入数据
        List<QuestionGroup> questionGroupList = ob.getAnswerList();
        String label = ob.getType();
        List<Question> questionList = new ArrayList<>();
        for (QuestionGroup questionGroup : questionGroupList) {
            for (Question question : questionGroup.getList()) {
                questionList.add(question);
            } 
        }


        List<Answer> answerList = new ArrayList<>();
        for (Question question : questionList) {
            Answer answer = new Answer();
            answer.setId(question.getId());
            answer.setAnswer(question.getAnswers());
            answer.setLabel(ob.getType());
            answerList.add(answer);
        }

        SqlSession sqlSession = com.zhengsongjun.mybatisSQL.util.SQLSession.getSqlSession();
        AnswerMapper answerMapper = sqlSession.getMapper(AnswerMapper.class);
        answerMapper.insertList(answerList);
        sqlSession.commit();
        sqlSession.close();

    }
}
