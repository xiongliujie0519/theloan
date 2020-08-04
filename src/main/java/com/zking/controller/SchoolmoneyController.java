package com.zking.controller;

import com.zking.model.Shooolmoney;
import com.zking.service.IShoolmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Schoolmoney")
public class SchoolmoneyController {

    @Autowired
    private IShoolmoneyService iShoolmoneyService;


    @RequestMapping("findSchoolmoney")
    @ResponseBody
    public List<Shooolmoney> findSchoolmoney(){
        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.list();
        System.out.println(shoolmoneyList);
            return shoolmoneyList;
    }
}
