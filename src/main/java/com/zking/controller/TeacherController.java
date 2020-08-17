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

    /**
     * 老师审核
     * @param model
     * @param teacher
     * @return
     */
    @RequestMapping("teachershen")
    @ResponseBody
    public Map<String,Object> teachershen(Model model ,Teacher teacher,PageBean pageBean,HttpServletRequest req,Student student){
        pageBean.setRows(4);
        pageBean.setRequest(req);
        String mtName = req.getParameter("mtName");
        Map<String,Object> map = new HashMap<>();
        List<Teacher> teachershens = iTeacherService.listteachershen(teacher,pageBean,mtName,student);
        System.out.println(student);
        if(teachershens!=null){
            map.put("rows",teachershens);
            map.put("total",pageBean.getTotal());
        }else{
            map.put("msg","no");
        }
        return map;
    }


    /**
     * 人事审核
     * @param model
     * @param teacher
     * @return
     */
    @RequestMapping("renshishen")
    @ResponseBody
    public Map<String,Object> renshishen(Model model ,Teacher teacher,PageBean pageBean,HttpServletRequest req,Student student){
        pageBean.setRows(4);
        pageBean.setRequest(req);
        String mtName = req.getParameter("mtName");
        Map<String,Object> map = new HashMap<>();
        List<Teacher> teachershens = iTeacherService.listrenshishen(teacher,mtName,pageBean,student);
        if(teachershens!=null){
            map.put("rows",teachershens);
            map.put("total",pageBean.getTotal());
        }else{
            map.put("msg","no");
        }
        return map;
    }

    @RequestMapping("caiwushen")
    @ResponseBody
    public Map<String,Object> caiwushen(Model model, String mtName,PageBean pageBean,HttpServletRequest req){
        Map<String,Object> map  = new HashMap<>();
        pageBean.setRequest(req);
        List<Teacher> caiwushen = iTeacherService.listcaiwushen(mtName,pageBean);
        if(caiwushen!=null){
            map.put("rows",caiwushen);
            map.put("total",pageBean.getTotal());
        }else{
            map.put("msg","no");
        }
        return map;
    }

    @RequestMapping("selectTeacherLie")
    @ResponseBody
    public Map<String,Object> selectTeacherLie(Model model, Teacher teacher){
        Map<String,Object> map = new HashMap<>();
        Teacher tea = iTeacherService.selectTeacherLie(teacher);
        teacher.setTeacherId(tea.getTeacherId());
        int i = iTeacherService.updateTeacherLie(teacher);
        System.out.println(tea);
        if(tea.getTeacherId()!=null){
            map.put("msg","该老师被绑定");
        }else{
            if(i>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }
        return map;
    }

    /**根据userid查询老师id
     *
     * @param model
     * @param teacher
     * @return
     */
    @RequestMapping("getByuserId")
    @ResponseBody
    public Map<String,Object> getByuserId(Model model,Teacher teacher){
        Map<String,Object> map = new HashMap<>();
        Teacher byuserId = iTeacherService.getByuserId(teacher);
        System.out.println(byuserId);
        if(byuserId!=null){
            map.put("row",byuserId);
        }else{
            map.put("msg","no");
        }
        return map;
    }

}
