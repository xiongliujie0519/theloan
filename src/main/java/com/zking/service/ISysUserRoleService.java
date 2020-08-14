package com.zking.service;

import com.zking.model.SysUserRole;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISysUserRoleService {
    int deleteByPrimaryKey(Integer urid);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    /**
     * 添加用户角色桥接表信息
     * @param sysUserRole
     * @return
     */
    int insertUserRole(SysUserRole sysUserRole);

    /**
     * 修改用户角色桥接表信息
     * @param sysUserRole
     * @return
     */
    int updateUserRole(SysUserRole sysUserRole);
}