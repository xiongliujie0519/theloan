package com.zking.service.impl;

import com.zking.mapper.SysRoleMapper;
import com.zking.model.SysRole;
import com.zking.model.SysRoleStaff;
import com.zking.service.ISysRoleService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer roleid) {
        return 0;
    }

    @Override
    public int insert(SysRole record) {
        return 0;
    }

    @Override
    public int insertSelective(SysRole record) {
        return 0;
    }

    @Override
    public SysRole selectByPrimaryKey(Integer roleid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return 0;
    }

    @Override
    public List<SysRole> listSysRole(SysRole sysRole, PageBean pageBean) {
        return sysRoleMapper.listSysRole(sysRole);
    }

    @Override
    public int addSysRole(SysRole sysRole) {
        return sysRoleMapper.addSysRole(sysRole);
    }

    @Override
    public int addStaff(SysRoleStaff sysRoleStaff) {
        return sysRoleMapper.addStaff(sysRoleStaff);
    }

    @Override
    public int getMax() {
        return sysRoleMapper.getMax();
    }
}
