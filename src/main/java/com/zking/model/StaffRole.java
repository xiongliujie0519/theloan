package com.zking.model;

public class StaffRole {

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    private  Integer srId;

    private Integer staffId;

    private Integer roleId;

    public StaffRole(Integer staffId, Integer roleId) {
        this.staffId = staffId;
        this.roleId = roleId;
    }

    public StaffRole() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}