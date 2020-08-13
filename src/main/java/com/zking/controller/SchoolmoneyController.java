package com.zking.controller;

import com.zking.model.MoneyApply;
import com.zking.model.Shooolmoney;
import com.zking.model.Student;
import com.zking.service.IMoneyApplyService;
import com.zking.service.IShoolmoneyService;
import com.zking.service.IStudentMoneyService;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Schoolmoney")
public class SchoolmoneyController {

    @Autowired
    private IShoolmoneyService iShoolmoneyService;
    @Autowired
    private IStudentMoneyService iStudentMoneyService;
    @Autowired
    private IMoneyApplyService iMoneyApplyService;

    @RequestMapping("findSchoolmoney")
    @ResponseBody
    public Map<String ,Object> findSchoolmoney(HttpServletRequest req, Model model, Shooolmoney shooolmoney){
        Map<String, Object> map = new HashMap<String, Object>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Integer mtId1 = 1;
        Integer mtId2 = 2;
        Integer mtId3 = 3;

        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.listZxj(shooolmoney,pageBean,mtId1,mtId2,mtId3);
        map.put("rows",shoolmoneyList);
        map.put("total",pageBean.getTotal());
        return map;
    }

    @RequestMapping("findZxjmoney")
    @ResponseBody
    public Map<String ,Object> findZxjmoney(HttpServletRequest req, Model model, Shooolmoney shooolmoney){
        Map<String, Object> map = new HashMap<String, Object>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Integer mtId1 = 101;
        Integer mtId2 = 102;
        Integer mtId3 = 103;

        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.listZxj(shooolmoney,pageBean,mtId1,mtId2,mtId3);
        map.put("rows",shoolmoneyList);
        map.put("total",pageBean.getTotal());
        return map;
    }

    @RequestMapping("findDkmoney")
    @ResponseBody
    public Map<String ,Object> findDkmoney(HttpServletRequest req, Model model, Shooolmoney shooolmoney){
        Map<String, Object> map = new HashMap<String, Object>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        Integer mtId1 = 201;
        Integer mtId2 = 202;
        Integer mtId3 = 203;

        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.listZxj(shooolmoney,pageBean,mtId1,mtId2,mtId3);
        map.put("rows",shoolmoneyList);
        map.put("total",pageBean.getTotal());
        return map;
    }

        @RequestMapping("findMoneyById")
        @ResponseBody
        public Shooolmoney findMoneyById(Model model,Integer smId){

            Shooolmoney moneyById = iShoolmoneyService.findMoneyById(smId);
            System.out.println(moneyById);
            return moneyById;
        }


    @RequestMapping("updateStudentMoney")
    @ResponseBody
    public int updateStudentMoney(Model model,Student student){

        int s = iStudentMoneyService.updateMoney(student);
        System.out.println(s);
        return s;
    }


    @RequestMapping("findStudentCount")
    @ResponseBody
    public int findStudentCount(Model model){

        int studentCount = iStudentMoneyService.findStudentCount();
        System.out.println(studentCount);
        return studentCount;
    }

    @RequestMapping("findStudentDKCount")
    @ResponseBody
    public int findStudentDKCount(Model model){

        int studentCount1 = iStudentMoneyService.findStudentDKCount();
        System.out.println(studentCount1);
        return studentCount1;
    }

    @RequestMapping("findStudentZXJCount")
    @ResponseBody
    public int findStudentZXJCount(Model model){

        int studentCount2 = iStudentMoneyService.findStudentZXJCount();
        System.out.println(studentCount2);
        return studentCount2;
    }



    @RequestMapping("findlistmoney")
    @ResponseBody
    public Map<String ,Object> findlistmoney(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Shooolmoney> shoolmoneyList = iShoolmoneyService.listMoney();
        map.put("rows",shoolmoneyList);
        return map;
    }


    @RequestMapping("addMoney")
    @ResponseBody
    public int addMoney(Model model, MoneyApply moneyApply,Student student){
        int money = iMoneyApplyService.addMoney(moneyApply);
        int i = iStudentMoneyService.updateMoney(student);
        System.out.println(i);
        return money;
    }
}
