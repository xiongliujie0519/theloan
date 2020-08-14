package com.zking.service.impl;

import com.github.pagehelper.Page;
import com.zking.mapper.ClassMapper;
import com.zking.mapper.TeacherMapper;
import com.zking.model.Class;
import com.zking.service.IClassService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Class> listClass(Class cla, PageBean pageBean) {
        return classMapper.listClass(cla);
    }

    @Override
    public Class selectTeacher(Class cla) {
        return classMapper.selectTeacher(cla);
    }

    @Override
    public List<Class> selectStudent(Class cla) {
        return classMapper.selectStudent(cla);
    }

    @Override
    public int insertclass(Class cla) {
        return classMapper.insertclass(cla);
    }

    @Override
    public int maxId() {
        return classMapper.maxId();
    }

    @Override
    public int insertTeacherClass(Integer teacherId, Integer classId) {
        return classMapper.insertTeacherClass(teacherId,classId);
    }

    @Override
    public int updateTeacherName(Integer teacherId, Integer classId) {
        return classMapper.updateTeacherName(teacherId,classId);
    }

    @Override
    public int fpstudent(Integer classId, Integer studentId) {
        return classMapper.fpstudent(classId,studentId);
    }
}
