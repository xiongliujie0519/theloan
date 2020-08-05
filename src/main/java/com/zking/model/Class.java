package com.zking.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Class {
    private Integer classId;

    private String className;




    public Class(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Class() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }



}