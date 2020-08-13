package com.zking.mapper;

import com.zking.model.SysRole;
import com.zking.model.SysRoleStaff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    /**
     * 查询角色信息
     * @param sysRole
     * @return
     */
    List<SysRole> listSysRole(SysRole sysRole);


    /**
     * 增加角色信息
     * @param sysRole
     * @return
     */
    int addSysRole(SysRole sysRole);

    /**
     * 增加角色部门桥接表信息
     * @param sysRoleStaff
     * @return
     */
    int addStaff(SysRoleStaff sysRoleStaff);

    /**
     * 获取角色的最大id
     * @return
     */
    int getMax();


}