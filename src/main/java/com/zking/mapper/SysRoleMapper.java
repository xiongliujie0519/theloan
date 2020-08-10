package com.zking.mapper;

import com.zking.model.SysRole;
import com.zking.model.SysRoleStaff;
import org.apache.ibatis.annotations.Param;
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


    /**
     * 根据roleid删除主表信息
     * @param sysRole
     * @return
     */
    int deletesysRole(SysRole sysRole);


    /**
     * 根据roleid删除角色部门信息
     * @param sysRole
     * @return
     */
    int deletesysRoleStaff(SysRole sysRole);


    /**
     * 根据roleid修改角色信息
     * @param sysRole
     * @return
     */
    int updatesysRole(SysRole sysRole);


    /**
     * 根据roleid修改角色部门类型桥接表信息
     * @param
     * @return
     */
    int updatesysRoleStaff(@Param("stId") Integer stId,@Param("roleid") Integer roleid);


    /**
     * 根据roleid查看信息
     * @param sysRole
     * @return
     */
    SysRole loadByRoleid(SysRole sysRole);


}