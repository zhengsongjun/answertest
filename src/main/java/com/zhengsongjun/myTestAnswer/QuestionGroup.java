package com.zhengsongjun.myTestAnswer;

import com.zhengsongjun.myTestAnswer.Question;

import java.util.List;

public class QuestionGroup {
    private Number type;
    private String name;
    private List<Question> list;

    public Number getType() {
        return type;
    }

    public void setType(Number type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "QuestionGroup{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
