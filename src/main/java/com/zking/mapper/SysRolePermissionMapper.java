package com.zking.mapper;

import com.zking.model.SysRolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolePermissionMapper {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    /**
     * 添加角色权限表信息
     * @param sysRolePermission
     * @return
     */
    int insertRolePermission(SysRolePermission sysRolePermission);
}