package com.zking.service.impl;

import com.zking.mapper.SysPermissionMapper;
import com.zking.model.SysPermission;
import com.zking.service.ISysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl implements ISysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer perid) {
        return 0;
    }

    @Override
    public int insert(SysPermission record) {
        return 0;
    }

    @Override
    public int insertSelective(SysPermission record) {
        return 0;
    }

    @Override
    public SysPermission selectByPrimaryKey(Integer perid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysPermission record) {
        return 0;
    }

    @Override
    public List<SysPermission> queryrootNode(String username) {
        List<SysPermission> sysPermissions = sysPermissionMapper.queryrootNode(username);

        for (SysPermission sysPermission : sysPermissions) {
            //传递参数：
            //1) 父节点的ID=10 11 12
            //2) 当前父节点对象
           queryModuleByPid(sysPermission.getPerid(),sysPermission,username);
        }
        return sysPermissions;
    }

    @Override
    public List<SysPermission> queryNode() {
        List<SysPermission> nodes = sysPermissionMapper.queryNode();
        for (SysPermission node : nodes) {
            queryNodeByPid(node.getPerid(),node);
        }
        return nodes;
    }

    @Override
    public void queryModuleByPid(Integer pid,SysPermission sysPermission,String username) {
        List<SysPermission> sysPermissions = sysPermissionMapper.queryModuleByperid(pid,sysPermission,username);
        sysPermission.setChildren(sysPermissions);
    }

    @Override
    public void queryNodeByPid(Integer pid, SysPermission sysPermission) {
        List<SysPermission> sysPermissions = sysPermissionMapper.queryNodeByperid(pid);
        sysPermission.setChildren(sysPermissions);
    }


}
