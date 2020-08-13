package com.zking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.util.Date;

@ToString
public class SysRole {
    private Integer roleid;

    private String rolename;

    private String description;

    @JsonFormat(timezone="GTM+8",pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;

    private String roleCzr;

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }

    private  StaffType staffType;

    public SysRole(Integer roleid, String rolename, String description, Date date, String roleCzr) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.description = description;
        this.date = date;
        this.roleCzr = roleCzr;
    }

    public SysRole() {
        super();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoleCzr() {
        return roleCzr;
    }

    public void setRoleCzr(String roleCzr) {
        this.roleCzr = roleCzr;
    }
}