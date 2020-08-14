package com.zking.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Class {
    private Integer classId;

    private String className;

    private  Teacher teacher;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private  Student student;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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