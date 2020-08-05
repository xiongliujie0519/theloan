package com.zking.controller;

import com.zking.model.Teacher;
import com.zking.service.ITeacherService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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




}
