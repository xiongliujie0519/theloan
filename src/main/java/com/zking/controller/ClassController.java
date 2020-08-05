package com.zking.controller;

import com.zking.model.Class;

import com.zking.service.IClassService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ClassController")
public class ClassController {
   @Autowired
    private IClassService iClassService;
    private PageBean pageBean;
    //查询
    @RequestMapping("finclass")
    @ResponseBody
    public Map<String,Object> finclass(Class cla, HttpServletRequest req){
        pageBean=new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        cla=new Class();
        List<Class> classes = iClassService.listClass(cla,pageBean);
        for (Class aClass : classes) {
            System.out.println(aClass);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("rows",classes);
        map.put("tools",pageBean.getTotal());
        return map;
    }




}
