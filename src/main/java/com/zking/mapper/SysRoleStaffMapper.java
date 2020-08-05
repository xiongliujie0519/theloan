package com.zking.mapper;

import com.zking.model.SysRoleStaff;

public interface SysRoleStaffMapper {
    int deleteByPrimaryKey(Integer rs);

    int insert(SysRoleStaff record);

    int insertSelective(SysRoleStaff record);

    SysRoleStaff selectByPrimaryKey(Integer rs);

    int updateByPrimaryKeySelective(SysRoleStaff record);

    int updateByPrimaryKey(SysRoleStaff record);
}