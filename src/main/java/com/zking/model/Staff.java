package com.zking.model;

public class Staff {
    private Integer staffId;

    private Integer userId;

    private Integer stId;

    private String staffName;


    public String getStaffCzr() {
        return staffCzr;
    }

    public void setStaffCzr(String staffCzr) {
        this.staffCzr = staffCzr;
    }

    public Integer getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(Integer staffSex) {
        this.staffSex = staffSex;
    }

    private Integer staffSex;

    private String staffCzr;

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }

    private  StaffType staffType;

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    private SysRole sysRole;

    public StaffRole getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(StaffRole staffRole) {
        this.staffRole = staffRole;
    }

    private StaffRole staffRole;

    public Staff(Integer staffId, Integer userId, Integer stId, String staffName) {
        this.staffId = staffId;
        this.userId = userId;
        this.stId = stId;
        this.staffName = staffName;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}