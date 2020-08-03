package com.zking.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.model.SysPermission;
import com.zking.service.ISysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("sysPermission")
public class SysPermissionController {

    @Autowired
    private ISysPermissionService sysPermissionService;

    @RequestMapping(value="/queryNode")
    @ResponseBody
    public List<SysPermission> queryNode(){
        List<SysPermission> sysPermissions = sysPermissionService.queryrootNode();
        return sysPermissions;
    }


}
