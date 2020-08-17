package com.zking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.util.Date;

@ToString
public class MoneyApply {
    private Integer maId;

    private Integer smId;

    private Integer tcId;

    private Integer studentId;

    private Integer staffId;

    private  String maInfo;

    public String getMaInfo() {
        return maInfo;
    }

    public void setMaInfo(String maInfo) {
        this.maInfo = maInfo;
    }

    private String auditdate;

    private String disposedate;

    private Integer caiwuId;

    public Integer getCaiwuId() {
        return caiwuId;
    }

    public void setCaiwuId(Integer caiwuId) {
        this.caiwuId = caiwuId;
    }

    @JsonFormat(timezone="GTM+8",pattern="yyyy-MM-dd HH:mm:ss")
    private Date applydate;

    public MoneyApply(Integer maId, Integer smId, Integer tcId, Integer studentId, Integer staffId, String auditdate, String disposedate, Date applydate) {
        this.maId = maId;
        this.smId = smId;
        this.tcId = tcId;
        this.studentId = studentId;
        this.staffId = staffId;
        this.auditdate = auditdate;
        this.disposedate = disposedate;
        this.applydate = applydate;
    }

    public MoneyApply() {
        super();
    }

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getTcId() {
        return tcId;
    }

    public void setTcId(Integer tcId) {
        this.tcId = tcId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(String auditdate) {
        this.auditdate = auditdate;
    }

    public String getDisposedate() {
        return disposedate;
    }

    public void setDisposedate(String disposedate) {
        this.disposedate = disposedate;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }
}