package com.zking.mapper;

import com.zking.model.SysRole;
import com.zking.model.SysUser;
import com.zking.model.SysUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleMapper {
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