package com.zking.controller;

import com.zking.model.Class;

import com.zking.model.Student;
import com.zking.service.IClassService;
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
    //查看老师
    @RequestMapping("ckTeacher")
    @ResponseBody
    public Class danteacher(Model model, Class cls){
        Class aClass = iClassService.selectTeacher(cls);
        return aClass;
    }

    //查看学生
    @RequestMapping("ckStudent")
    @ResponseBody
    public List<Class> danstudent(Model model, Class cls){
        List<Class> classes = iClassService.selectStudent(cls);
        return classes;
    }
   //添加班级&分配老师
    @RequestMapping("tjclassteacher")
    @ResponseBody
   public  int tjclassteacher(Model model,Class cla ,Integer teacherId){
        int insertclass = iClassService.insertclass(cla);
        int i = iClassService.maxId();
        int i1 = iClassService.insertTeacherClass(teacherId, i);
      return insertclass;
    }
    //修改老师姓名
    @RequestMapping("updateTeacherName")
    @ResponseBody
    public int updateTeacherName(Model model,Integer classId, Integer teacherId){
        int i = iClassService.updateTeacherName(teacherId, classId);
        return i;
    }

    //分配老师
    @RequestMapping("fpstudent")
    @ResponseBody
    public int fpstudent(Model model,Integer classId,Integer studentId){
        int fpstudent = iClassService.fpstudent(classId, studentId);
        return fpstudent;
    }
}
