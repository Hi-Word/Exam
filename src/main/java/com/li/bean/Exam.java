package com.li.bean;

import lombok.Data;

import java.util.Date;

public class Exam {
    private int examId;
    private int paperId;
    private Date examBegin;
    private Date examEnd;
    private Paper paper;
}
