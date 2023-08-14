package com.zhengsongjun.myTestAnswer;

import java.util.HashMap;
import java.util.List;

public class Question {
    private String id;
    private String content;
    private List<HashMap<String,String>> options;
    private Number type;
    private String answers;
    private Number totalScore;
    private Number score;
    private Number correctStatus;
    private List<String> subQuesList;

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", options=" + options +
                ", type=" + type +
                ", answers='" + answers + '\'' +
                ", totalScore=" + totalScore +
                ", score=" + score +
                ", correctStatus=" + correctStatus +
                ", subQuesList=" + subQuesList +
                ", analysis='" + analysis + '\'' +
                ", studentAnswer='" + studentAnswer + '\'' +
                '}';
    }

    public Number getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Number totalScore) {
        this.totalScore = totalScore;
    }

    public Number getScore() {
        return score;
    }

    public void setScore(Number score) {
        this.score = score;
    }

    public Number getCorrectStatus() {
        return correctStatus;
    }

    public void setCorrectStatus(Number correctStatus) {
        this.correctStatus = correctStatus;
    }

    public List<String> getSubQuesList() {
        return subQuesList;
    }

    public void setSubQuesList(List<String> subQuesList) {
        this.subQuesList = subQuesList;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    private String analysis;
    private String studentAnswer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<HashMap<String, String>> getOptions() {
        return options;
    }

    public void setOptions(List<HashMap<String, String>> options) {
        this.options = options;
    }

    public Number getType() {
        return type;
    }

    public void setType(Number type) {
        this.type = type;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

}
