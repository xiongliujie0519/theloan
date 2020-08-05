package com.zking.controller;

import com.zking.model.Shooolmoney;
import com.zking.service.IShoolmoneyService;
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
@RequestMapping("Schoolmoney")
public class SchoolmoneyController {

    @Autowired
    private IShoolmoneyService iShoolmoneyService;


    @RequestMapping("findSchoolmoney")
    @ResponseBody
    public Map<String ,Object> findSchoolmoney(HttpServletRequest req, Model model,Shooolmoney shooolmoney){
        Map<String, Object> map = new HashMap<String, Object>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.list(shooolmoney,pageBean);
        //System.out.println(shoolmoneyList);
        map.put("rows",shoolmoneyList);
        map.put("total",pageBean.getTotal());
        return map;
    }
}
