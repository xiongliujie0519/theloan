package com.zking.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SysUser {
    private Integer userid;

    private String username;

    private String password;

    private String salt;

    @JsonFormat(timezone="GTM+8",pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    private String userczr;

    public String getUserczr() {
        return userczr;
    }

    public void setUserczr(String userczr) {
        this.userczr = userczr;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    private  SysRole sysRole;

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    private Integer userstate;

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }

    private StaffType staffType;


    private SysUserRole userRole;

    public SysUserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(SysUserRole userRole) {
        this.userRole = userRole;
    }

    public SysUser(Integer userid, String username, String password, String salt, Date createdate) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.createdate = createdate;
    }

    public SysUser() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}