package com.zhengsongjun.myTestAnswer;

import java.util.List;

public class AllGroup {
    private String type;
    private List<QuestionGroup> answerList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<QuestionGroup> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<QuestionGroup> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "AllGroup{" +
                "type='" + type + '\'' +
                ", answerList=" + answerList +
                '}';
    }
}
