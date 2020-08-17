package com.zking.service.impl;

import com.github.pagehelper.Page;
import com.zking.mapper.TeacherMapper;
import com.zking.model.Student;
import com.zking.model.Teacher;
import com.zking.service.ITeacherService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper tm;
    @Override
    public Teacher finAll(Teacher teacher, PageBean pageBean) {
        return tm.finAll(teacher);
    }

    @Override
    public List<Teacher> listckteacher(Teacher teacher ,PageBean pageBean) {
        return tm.listckteacher(teacher);
    }

    @Override
    public List<Teacher> listckNamePaw(Teacher teacher,PageBean pageBean) {
        return tm.listckNamePaw(teacher);
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        return tm.insertTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return tm.updateTeacher(teacher);
    }

    @Override
    public int delTeacher(Teacher teacher) {
        return tm.delTeacher(teacher);
    }

    @Override
    public  List<Teacher> listteachershen(Teacher teacher,PageBean pageBean,String mtName,Student student) {
        return tm.teachershen(teacher,mtName,student);
    }

    @Override
    public List<Teacher> listrenshishen(Teacher teacher, String mtName,PageBean pageBean,Student student) {
        return tm.renshishen(teacher,mtName,student);
    }

    @Override
    public List<Teacher> listcaiwushen(String mtName, PageBean pageBean) {
        return tm.caiwushen(mtName);
    }


    @Override
    public Teacher selectTeacherLie(Teacher teacher) {
        return tm.selectTeacherLie(teacher);
    }


    @Override
    public int updateTeacherLie(Teacher teacher) {
        return tm.updateTeacherLie(teacher);
    }

    @Override
    public Teacher getByuserId(Teacher teacher) {
        return tm.getByuserId(teacher);
    }
}
