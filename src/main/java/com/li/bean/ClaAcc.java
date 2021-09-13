package com.li.bean;


import lombok.Data;

/**
 * 及格率展示
 */
@Data
public class ClaAcc {
    private int classaccId;
    private String examName;
    private String claName;
    private int toscPer;
    private int acscPer;
    private double acc;

    public ClaAcc(int classaccId, String examName, String claName, int toscPer, int acscPer, double acc) {
        this.classaccId = classaccId;
        this.examName = examName;
        this.claName = claName;
        this.toscPer = toscPer;
        this.acscPer = acscPer;
        this.acc = acc;
    }

    public ClaAcc() {
    }
}
