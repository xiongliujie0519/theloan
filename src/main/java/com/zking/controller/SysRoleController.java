package com.zking.controller;

import com.zking.model.SysRole;
import com.zking.model.SysRoleStaff;
import com.zking.service.ISysRoleService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sysRole")
public class SysRoleController {


    @Autowired
    private ISysRoleService sysRoleService;


    /**
     * 查询角色信息
     * @return
     */
    @RequestMapping("listSysRole")
    @ResponseBody
    public Map<String,Object> listSysRole(HttpServletRequest req, Model model , SysRole sysRole){
        Map<String,Object> map = new HashMap<>();
        PageBean pageBean = new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        List<SysRole> sysRoles = sysRoleService.listSysRole(sysRole, pageBean);
        map.put("rows",sysRoles);
        map.put("total",pageBean.getTotal());
        return map;
    }


    /**
     * 增加角色信息&&增加角色部门桥接表信息
     * @return
     */
    @RequestMapping("addSysRole")
    @ResponseBody
    public Map<String,Object> addSysRole(HttpServletRequest req,Model model,SysRole sysRole){
        System.out.println(sysRole.toString());
        Map<String,Object> map  = new HashMap<>();
//        //先增加角色信息
        int i = sysRoleService.addSysRole(sysRole);
        //在增加角色部门桥接表
        SysRoleStaff srs = new SysRoleStaff();
        int roleid = sysRoleService.getMax();
        srs.setRoleid(roleid);
//
        String stId = req.getParameter("stId");
        srs.setStaffId(Integer.parseInt(stId));
        System.out.println(srs);
        int i1 = sysRoleService.addStaff(srs);
        if(i>0 && i1>0){
            map.put("msg",1);
        }else{
            map.put("msg",0);
        }
        return map;
    }



}
