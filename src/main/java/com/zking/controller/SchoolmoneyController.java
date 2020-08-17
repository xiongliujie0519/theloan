package com.zking.controller;

import com.zking.model.*;
import com.zking.service.*;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("Schoolmoney")
public class SchoolmoneyController {

    @Autowired
    private IShoolmoneyService iShoolmoneyService;
    @Autowired
    private IStudentMoneyService iStudentMoneyService;
    @Autowired
    private IMoneyApplyService iMoneyApplyService;
    @Autowired
    private IFinancedetailService iFinancedetailService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private  IShoolmoneyService shoolmoneyService;

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
        public Shooolmoney findMoneyById(Model model,Integer maId){
            Shooolmoney moneyById = iShoolmoneyService.findMoneyById(maId);
            System.out.println(moneyById);
            return moneyById;
        }

    @RequestMapping("findMoneySQById")
    @ResponseBody
    public Shooolmoney findMoneySQById(Model model,Integer smId){

        Shooolmoney moneyById = iShoolmoneyService.findMoneySQById(smId);
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


    /**
     * 老师审核已通过
     * @param model
     * @param moneyApply
     * @param teacherId
     * @return
     */
    @RequestMapping("teachershenhei")
    @ResponseBody
    public Map<String,Object> teachershenhei(Model model,MoneyApply moneyApply,Integer teacherId,HttpServletRequest request,Student student){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        df.format(new Date());
        moneyApply.setAuditdate(df.format(new Date()));
        String aa = request.getParameter("studentId");
        Integer studentId = Integer.parseInt(aa);
        System.out.println(aa);
        int teachershenhei = iMoneyApplyService.teachershenhei(moneyApply, teacherId);
        int updateytg = studentService.updateytg(student);
         System.out.println(updateytg);
        if(teachershenhei>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }

    /**
     * 老师审核未通过
     * @param model
     * @param moneyApply
     * @param teacherId
     * @return
     */
    @RequestMapping("teachershenheiwtg")
    @ResponseBody
    public Map<String,Object> teachershenheiwtg(Model model,MoneyApply moneyApply,Integer teacherId,HttpServletRequest request,Student student){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        df.format(new Date());
        moneyApply.setAuditdate(df.format(new Date()));
        String aa = request.getParameter("studentId");
        Integer studentId = Integer.parseInt(aa);
        System.out.println(aa);
        int teachershenhei = iMoneyApplyService.teachershenhei(moneyApply, teacherId);
        int updateytg = studentService.updatewtg(student);
        System.out.println(updateytg);
        if(teachershenhei>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }

    //人事审核未通过  renshishenhei
    /**
     * 人事审核未通过
     * @param model
     * @param moneyApply
     * @param staffId
     * @return
     */
    @RequestMapping("renshishenheiwtg")
    @ResponseBody
    public Map<String,Object> renshishenheiwtg(Model model,MoneyApply moneyApply,Integer staffId,HttpServletRequest request,Student student){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        df.format(new Date());
        moneyApply.setAuditdate(df.format(new Date()));
        String aa = request.getParameter("studentId");
        Integer studentId = Integer.parseInt(aa);
        System.out.println(aa);
        int teachershenhei = iMoneyApplyService.renshishenhei(moneyApply, staffId);
        int updateytg = studentService.updatewtg(student);
        System.out.println(updateytg);
        if(teachershenhei>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }




    //人事审核已通过  renshishenheiytg
    /**
     * 人事审核已通过
     * @param model
     * @param moneyApply
     * @param staffId
     * @return
     */
    @RequestMapping("renshishenheiytg")
    @ResponseBody
    public Map<String,Object> renshishenheiytg(Model model,MoneyApply moneyApply,Integer staffId,HttpServletRequest request,Student student){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        df.format(new Date());
        moneyApply.setAuditdate(df.format(new Date()));
        String aa = request.getParameter("studentId");
        Integer studentId = Integer.parseInt(aa);
        System.out.println(aa);
        int teachershenhei = iMoneyApplyService.renshishenhei(moneyApply, staffId);
        int updateytg = studentService.updateytg(student);
        System.out.println(updateytg);
        if(teachershenhei>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }

    /**
     * 财务处理
     * @param model
     * @param moneyApply
     * @param staffId
     * @param financedetail
     * @return
     */
    @RequestMapping("caiwuchuli")
    @ResponseBody
    public Map<String,Object> caiwuchuli(Model model, MoneyApply moneyApply, Integer staffId, Financedetail financedetail,Student student){
        Map<String,Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        df.format(new Date());
        moneyApply.setDisposedate(df.format(new Date()));
        int caiwuchuli = iMoneyApplyService.caiwuchuli(moneyApply, staffId);
        int updatecaiwu = studentService.updatecaiwu(student);
        System.out.println(updatecaiwu);
        int i = iFinancedetailService.insertInfo(financedetail);
        System.out.println(i);
        if(caiwuchuli>0){
                map.put("index",1);
        }else{
                map.put("index",0);
        }
        return map;
    }


    /**
     * 查询发布信息
     * @param model
     * @param shooolmoney
     * @param mtName
     * @param pageBean
     * @param request
     * @return
     */
    @RequestMapping("listShooolmoneyAll")
    @ResponseBody
    public Map<String,Object> listShooolmoneyAll(Model model,Shooolmoney shooolmoney,String mtName,PageBean pageBean,HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        pageBean.setRows(4);
        pageBean.setRequest(request);
        List<Shooolmoney> shooolmonies = shoolmoneyService.listShooolmoneyAll(shooolmoney, mtName, pageBean);
        if(shooolmonies!=null){
            map.put("rows",shooolmonies);
            map.put("total",pageBean.getTotal());
        }else{
            map.put("msg","no");
        }
        return map;
    }


    /**
     * 添加发布信息
     * @param model
     * @param shooolmoney
     * @param request
     * @return
     */
    @RequestMapping("insertShooolmoney")
    @ResponseBody
    public Map<String,Object> insertShooolmoney(Model model,Shooolmoney shooolmoney,HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        String date = request.getParameter("date");
        System.out.println(shooolmoney);
        System.out.println(date);
        int insert = shoolmoneyService.insert(shooolmoney);
        if(insert>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }

    /**
     * 审核发布任务
     * @param model
     * @param shooolmoney
     * @return
     */
    @RequestMapping("updateStatus")
    @ResponseBody
    public Map<String,Object> updateStatus(Model model,Shooolmoney shooolmoney){
        Map<String,Object> map = new HashMap<>();
        int i = shoolmoneyService.updateStatus(shooolmoney);
        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }
}
