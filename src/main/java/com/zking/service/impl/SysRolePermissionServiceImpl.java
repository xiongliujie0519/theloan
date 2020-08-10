package com.zking.service.impl;

import com.zking.mapper.SysRolePermissionMapper;
import com.zking.model.SysRolePermission;
import com.zking.service.ISysRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRolePermissionServiceImpl implements ISysRolePermissionService {

    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public int insert(SysRolePermission record) {
        return 0;
    }

    @Override
    public int insertSelective(SysRolePermission record) {
        return 0;
    }

    @Override
    public int insertRolePermission(SysRolePermission sysRolePermission) {
        return sysRolePermissionMapper.insertRolePermission(sysRolePermission);
    }
}
