package com.zking.model;

import lombok.ToString;

@ToString
public class SysRoleStaff {
    private Integer rs;

    private Integer roleid;

    private Integer staffId;

    public SysRoleStaff(Integer rs, Integer roleid, Integer staffId) {
        this.rs = rs;
        this.roleid = roleid;
        this.staffId = staffId;
    }

    public SysRoleStaff() {
        super();
    }

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}