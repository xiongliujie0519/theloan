package com.zking.controller;

import com.zking.model.Student;
import com.zking.model.Teacher;
import com.zking.service.ITeacherService;
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
@RequestMapping("TeacherController")
public class TeacherController {
   @Autowired
    private ITeacherService iTeacherService;
    private PageBean pageBean;
    //查询
    @RequestMapping("finAlly")
    @ResponseBody
    public Teacher finAlly(Model model, Teacher teacher){
         pageBean=new PageBean();
        pageBean.setRows(2);
        teacher.setTeacherId(1);
        Teacher teachers = iTeacherService.finAll(teacher,pageBean);
        return teachers;
    }
    //查看老师信息
    @RequestMapping("finTeacher")
    @ResponseBody
    public Map<String,Object> finTeacher(Model model, Teacher teacher, HttpServletRequest req){
        pageBean=new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        List<Teacher> listckteacher = iTeacherService.listckteacher(teacher, pageBean);
        for (Teacher teacher1 : listckteacher) {
            System.out.println(teacher1);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("rows",listckteacher);
        map.put("tools",pageBean.getTotal());
        return map;
    }
    //查看老师账号密码
    @RequestMapping("finTeacherNamePwd")
    @ResponseBody
    public Map<String,Object> finteacherNamePwd(Model model, Teacher teacher, HttpServletRequest req){
        pageBean=new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        List<Teacher> teachers = iTeacherService.listckNamePaw(teacher, pageBean);
        for (Teacher teacher1 : teachers) {
            System.out.println(teacher1);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("rows",teachers);
        map.put("tools",pageBean.getTotal());
        return map;
    }


    @RequestMapping("insertTeacher")
    @ResponseBody
    public int intsertTeacher(Model model,Teacher teacher){
        int i = iTeacherService.insertTeacher(teacher);
        System.out.println(i);
        return i;

    }
    @RequestMapping("updateTeacher")
    @ResponseBody
    public int updateTeacher(Model model,Teacher teacher){
        int i = iTeacherService.updateTeacher(teacher);
        System.out.println(i);
        return i;

    }
    @RequestMapping("delTeacher")
    @ResponseBody
    public int delTeacher(Model model,Teacher teacher){
        int i = iTeacherService.delTeacher(teacher);
        System.out.println(i);
        return i;

    }
}
