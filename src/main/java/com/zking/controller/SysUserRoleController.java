package com.zking.controller;

import com.zking.model.SysUser;
import com.zking.model.SysUserRole;
import com.zking.service.ISysUserRoleService;
import com.zking.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("SysUserRole")
public class SysUserRoleController {

    @Autowired
    private ISysUserRoleService sysUserRoleService;

    @Autowired
    private ISysUserService sysUserService;
    /**
     * 保存用户角色桥接表信息
     * @param model
     * @param sysUserRole
     * @return
     */
    @RequestMapping("SaveUserRole")
    @ResponseBody
    public Map<String,Object> SaveUserRole(Model model, SysUserRole sysUserRole, SysUser sysUser){
        Map<String,Object> map = new HashMap<>();
        if(sysUserRole.getUrid()!=null){
            int i = sysUserRoleService.updateUserRole(sysUserRole);
            int i1 = sysUserService.updateUserCzr(sysUser);
            if(i>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }else{
            int i = sysUserRoleService.insertUserRole(sysUserRole);
            int i1 = sysUserService.updateUserCzr(sysUser);
            if(i>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }
        return map;
    }


}
