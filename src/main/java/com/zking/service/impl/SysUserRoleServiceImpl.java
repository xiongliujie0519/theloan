package com.zking.service.impl;

import com.zking.mapper.SysUserRoleMapper;
import com.zking.model.SysUserRole;
import com.zking.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer urid) {
        return 0;
    }

    @Override
    public int insert(SysUserRole record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUserRole record) {
        return 0;
    }

    @Override
    public SysUserRole selectByPrimaryKey(Integer urid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUserRole record) {
        return 0;
    }

    @Override
    public int insertUserRole(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insertUserRole(sysUserRole);
    }

    @Override
    public int updateUserRole(SysUserRole sysUserRole) {
        return sysUserRoleMapper.updateUserRole(sysUserRole);
    }
}
