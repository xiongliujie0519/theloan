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
        Map<String,Object> map  = new HashMap<>();
//        //先增加角色信息
        int i = sysRoleService.addSysRole(sysRole);
        //在增加角色部门桥接表
        SysRoleStaff srs = new SysRoleStaff();
        int roleid = sysRoleService.getMax();
        srs.setRoleid(roleid);
//
        String stId = req.getParameter("stId");
        srs.setStId(Integer.parseInt(stId));
        System.out.println(srs);
        int i1 = sysRoleService.addStaff(srs);
        if(i>0 && i1>0){
            map.put("msg",1);
        }else{
            map.put("msg",0);
        }
        return map;
    }


    /**
     * 根据roleid删除主表和角色部门桥接表
     * @return
     */
    @RequestMapping("deletesysRole")
    @ResponseBody
    public Map<String,Object> deletesysRole(Model model , SysRole sysRole,HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //删除主表信息
        int i = sysRoleService.deletesysRole(sysRole);
        //删除桥接表信息
        int i1 = sysRoleService.deletesysRoleStaff(sysRole);
        if(i>0 && i1>=0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }


    /**
     * 根据roleid修改角色信息
     * @param model
     * @param sysRole
     * @param stId
     * @return
     */
    @RequestMapping("savesysRole")
    @ResponseBody
    public Map<String,Object> savesysRole(HttpServletRequest req,Model model , SysRole sysRole,Integer stId,Integer roleid){
        Map<String,Object> map = new HashMap<>();
        if(sysRole.getRoleid()!=null){
            int i = sysRoleService.updatesysRole(sysRole);
            int i1 = sysRoleService.updatesysRoleStaff(stId,roleid);
            System.out.println(stId);
            System.out.println(sysRole);
            if(i>0 && i1>0){
                map.put("index",1);
            }else{
                map.put("index",0);
            }
            System.out.println("修改");
        }else{
            //先增加角色信息
            int i = sysRoleService.addSysRole(sysRole);
            //在增加角色部门桥接表
            SysRoleStaff srs = new SysRoleStaff();
            int roleid1 = sysRoleService.getMax();
            srs.setRoleid(roleid1);
            String stId1 = req.getParameter("stId");
            srs.setStId(Integer.parseInt(stId1));
            System.out.println(srs);
            int i1 = sysRoleService.addStaff(srs);
            if(i>0 && i1>0){
                map.put("index",1);
            }else{
                map.put("index",0);
            }
            System.out.println("增加");
        }
        return  map;
    }


    /**
     * 根据roleid查询角色信息
     * @param model
     * @param sysRole
     * @return
     */
    @RequestMapping("loadByRoleid")
    @ResponseBody
    public Map<String,Object> loadByRoleid(Model model ,SysRole sysRole){
        Map<String,Object> map = new HashMap<>();
        SysRole sysrole = sysRoleService.loadByRoleid(sysRole);
        if(sysrole!=null){
            map.put("sysrole",sysrole);
        }else{
            map.put("msg","n");
        }
        return map;
    }

    /**
     * 查询出roleid和rolename
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String,Object> findAll(){
        Map<String,Object> map = new HashMap<>();
        List<SysRole> all = sysRoleService.findAll();
        if(all!=null){
            map.put("rows",all);
        }else{
            map.put("msg","no");
        }
        return map;
    }

}
