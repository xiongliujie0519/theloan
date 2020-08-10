package com.zking.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.model.SysPermission;
import com.zking.service.ISysPermissionService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("sysPermission")
public class SysPermissionController {

    @Autowired
    private ISysPermissionService sysPermissionService;

    @RequestMapping(value="/queryNode")
    @ResponseBody
    public List<SysPermission> queryNode(HttpServletRequest request){
        String username = request.getParameter("username");
        HttpSession session = request.getSession();
        session.setAttribute("username",username);
        String username1 = (String) session.getAttribute("username");
        System.out.println(username);
        List<SysPermission> sysPermissions = sysPermissionService.queryrootNode(username1);
        return sysPermissions;
    }

    @RequestMapping("NodeAll")
    @ResponseBody
    public List<SysPermission> queryNodeAll(){
        List<SysPermission> nodes = sysPermissionService.queryNode();
        return nodes;
    }

}
