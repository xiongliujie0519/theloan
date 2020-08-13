package com.zking.service;

import com.zking.model.SysRole;
import com.zking.model.SysRoleStaff;
import com.zking.util.PageBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISysRoleService {
    int deleteByPrimaryKey(Integer roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    @Transactional(readOnly = true)
    List<SysRole> listSysRole(SysRole sysRole, PageBean pageBean);


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