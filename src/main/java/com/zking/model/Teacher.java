package com.zking.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@ToString
public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Integer userId;

    private String teacherSex;

    private String teacherAddress;

    private String teacherTel;

    private SysUser sysUser;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public List<Class> getListClass() {
        return listClass;
    }

    public void setListClass(List<Class> listClass) {
        this.listClass = listClass;
    }

    /*一个老师对应多个班级*/
    private List<Class> listClass;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    public Class getClassa() {
        return classa;
    }

    public void setClassa(Class classa) {
        this.classa = classa;
    }

    private Class classa;


    private  MoneyApply  moneyApply;

    public MoneyApply getMoneyApply() {
        return moneyApply;
    }

    public void setMoneyApply(MoneyApply moneyApply) {
        this.moneyApply = moneyApply;
    }

    private MoneyType moneyType;

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    private  Shooolmoney shooolmoney;

    public Shooolmoney getShooolmoney() {
        return shooolmoney;
    }

    public void setShooolmoney(Shooolmoney shooolmoney) {
        this.shooolmoney = shooolmoney;
    }

    public Teacher(Integer teacherId, String teacherName, Integer userId, String teacherSex, String teacherAddress, String teacherTel) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.userId = userId;
        this.teacherSex = teacherSex;
        this.teacherAddress = teacherAddress;
        this.teacherTel = teacherTel;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public String getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel;
    }


}