package com.li.bean;

public class PapIdQuesCourse {
    private Integer papid;
    private String questionCourse;

    public PapIdQuesCourse(Integer papid, String questionCourse) {
        this.papid = papid;
        this.questionCourse = questionCourse;
    }

    public PapIdQuesCourse() {
    }

    public Integer getPapid() {
        return papid;
    }

    public void setPapid(Integer papid) {
        this.papid = papid;
    }

    public String getQuestionCourse() {
        return questionCourse;
    }

    public void setQuestionCourse(String questionCourse) {
        this.questionCourse = questionCourse;
    }
}
