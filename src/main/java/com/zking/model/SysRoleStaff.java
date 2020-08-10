package com.zking.model;

import lombok.ToString;

@ToString
public class SysRoleStaff {
    private Integer rs;

    private Integer roleid;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    private Integer stId;

    public SysRoleStaff(Integer rs, Integer roleid, Integer stId) {
        this.rs = rs;
        this.roleid = roleid;
        this.stId = stId;
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


}