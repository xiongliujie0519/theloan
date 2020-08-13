package com.zking.controller;

import com.zking.model.Score;
import com.zking.model.TeacherClass;
import com.zking.service.IScoreService;
import com.zking.service.ITeacherClassService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("TeacherClassController")
public class TeacherClassController {
   @Autowired
    private ITeacherClassService iTeacherClassService;
    private PageBean pageBean;
    @RequestMapping("fpTeacher")
    @ResponseBody
   public int fpteacher(Model model, TeacherClass teacherClass){
        int i = iTeacherClassService.allocationTeacher(teacherClass);
        System.out.println(i);
        return i;
    }



}
