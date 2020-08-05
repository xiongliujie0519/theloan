package com.zking.controller;

import com.zking.model.Class;
import com.zking.model.Student;
import com.zking.service.IClassService;
import com.zking.service.IStudentService;
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
@RequestMapping("StudentController")
public class StudentController {
   @Autowired
    private IStudentService studentService;
    private PageBean pageBean;
    //查询
    @RequestMapping("finStudent")
    @ResponseBody
    public Map<String,Object> finstudent(Model model, Student stu, HttpServletRequest req){
        pageBean=new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        List<Student> students = studentService.listStudent(stu, pageBean);
        for (Student student : students) {
            System.out.println(student);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("rows",students);
        map.put("tools",pageBean.getTotal());
        return map;
    }

    //单个查询
    @RequestMapping("danStudent")
    @ResponseBody
    public Student danstudent(Model model,Student stu){
        Student student = studentService.selStudent(stu);
        return student;
    }


}
