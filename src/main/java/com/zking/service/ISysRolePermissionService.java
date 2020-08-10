package com.zking.service;

import com.zking.model.SysRolePermission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISysRolePermissionService {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    /**
     * 添加角色权限表信息
     * @param sysRolePermission
     * @return
     */
    int insertRolePermission(SysRolePermission sysRolePermission);
}