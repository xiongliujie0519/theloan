package com.zking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.util.Date;
@ToString
public class Shooolmoney {
    private Integer smId;

    private Integer mtId;
    private String issuedate;
    private String stopdate;

    private Float smMoney;

    //钱类别表
    private MoneyType moneyType;
    public MoneyType getMoneyType() {
        return moneyType;
    }
    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    //钱申请表
    private MoneyApply moneyApply;
    public MoneyApply getMoneyApply() {
        return moneyApply;
    }
    public void setMoneyApply(MoneyApply moneyApply) {
        this.moneyApply = moneyApply;
    }

    //学生表
    private Student student;
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getSmStatus() {
        return smStatus;
    }

    public void setSmStatus(Integer smStatus) {
        this.smStatus = smStatus;
    }

    private Integer smStatus;

    public Shooolmoney(Integer smId, Integer mtId, String issuedate, String stopdate, Float smMoney) {
        this.smId = smId;
        this.mtId = mtId;
        this.issuedate = issuedate;
        this.stopdate = stopdate;
        this.smMoney = smMoney;
    }

    public Shooolmoney() {
        super();
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getMtId() {
        return mtId;
    }

    public void setMtId(Integer mtId) {
        this.mtId = mtId;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getStopdate() {
        return stopdate;
    }

    public void setStopdate(String stopdate) {
        this.stopdate = stopdate;
    }

    public Float getSmMoney() {
        return smMoney;
    }

    public void setSmMoney(Float smMoney) {
        this.smMoney = smMoney;
    }
}