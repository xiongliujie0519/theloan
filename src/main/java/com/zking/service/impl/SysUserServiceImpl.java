package com.zking.service.impl;

import com.zking.mapper.SysUserMapper;
import com.zking.model.SysUser;
import com.zking.service.ISysUserService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }

    @Override
    public SysUser userLogin(String username) {
        return sysUserMapper.userLogin(username);
    }

    @Override
    public Set<String> findRole(String username) {
        return sysUserMapper.findRole(username);
    }

    @Override
    public Set<String> findPermission(String username) {
        return sysUserMapper.findPermission(username);
    }

    @Override
    public int RegUser(SysUser sysUser) {
        return sysUserMapper.RegUser(sysUser);
    }

    @Override
    public List<SysUser> listsysUserAll(SysUser sysUser, PageBean pageBean) {
        return sysUserMapper.listsysUserAll(sysUser);
    }

    @Override
    public int userStart(SysUser sysUser) {
        return sysUserMapper.userStart(sysUser);
    }

    @Override
    public int userStop(SysUser sysUser) {
        return sysUserMapper.userStop(sysUser);
    }

    @Override
    public SysUser loadSysUserByid(SysUser sysUser) {
        return sysUserMapper.loadSysUserByid(sysUser);
    }

    @Override
    public int updateUserCzr(SysUser sysUser) {
        return sysUserMapper.updateUserCzr(sysUser);
    }

    @Override
    public SysUser findUserByid(SysUser sysUser) {
        return sysUserMapper.findUserByid(sysUser);
    }


}
