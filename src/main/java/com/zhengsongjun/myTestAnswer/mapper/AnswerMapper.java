package com.zhengsongjun.myTestAnswer.mapper;

import com.zhengsongjun.myTestAnswer.pojo.Answer;
import com.zhengsongjun.myTestAnswer.pojo.AnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
    long countByExample(AnswerExample example);

    int deleteByExample(AnswerExample example);

    int insert(Answer row);

    int insertSelective(Answer row);

    List<Answer> selectByExample(AnswerExample example);

    int updateByExampleSelective(@Param("row") Answer row, @Param("example") AnswerExample example);

    int updateByExample(@Param("row") Answer row, @Param("example") AnswerExample example);

    int insertList(@Param("AnswerList") List<Answer> answers);
}