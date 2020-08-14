package com.zking.controller;

import com.zking.model.SysRole;
import com.zking.model.SysRolePermission;
import com.zking.service.ISysRolePermissionService;
import com.zking.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("SysRolePermission")
public class SysRolePermissionController {

    @Autowired
    private ISysRolePermissionService sysRolePermissionService;
    @Autowired
    private ISysRoleService sysRoleService;

    @RequestMapping("insertRolePermission")
    @ResponseBody
    public Map<String,Object> insertRolePermission(Model model, SysRolePermission sysRolePermission, SysRole sysRole){
        Map<String,Object> map = new HashMap<>();
        int i = sysRolePermissionService.insertRolePermission(sysRolePermission);
        int i1 = sysRoleService.updateRoleCzr(sysRole);
        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }
}
