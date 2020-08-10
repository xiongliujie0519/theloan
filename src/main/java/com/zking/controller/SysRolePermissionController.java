package com.zking.controller;

import com.zking.model.SysRolePermission;
import com.zking.service.ISysRolePermissionService;
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

    @RequestMapping("insertRolePermission")
    @ResponseBody
    public Map<String,Object> insertRolePermission(Model model,SysRolePermission sysRolePermission){
        Map<String,Object> map = new HashMap<>();
        int i = sysRolePermissionService.insertRolePermission(sysRolePermission);

        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }
}
