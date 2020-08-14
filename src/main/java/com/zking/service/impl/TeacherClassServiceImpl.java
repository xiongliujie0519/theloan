package com.zking.service.impl;

import com.zking.mapper.TeacherClassMapper;
import com.zking.mapper.TeacherMapper;
import com.zking.model.Teacher;
import com.zking.model.TeacherClass;
import com.zking.service.ITeacherClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherClassServiceImpl implements ITeacherClassService {
    @Autowired
    private TeacherClassMapper teacherClassMapper;

    @Override
    public int allocationTeacher(TeacherClass teacherClass) {
        return teacherClassMapper.allocationTeacher(teacherClass);
    }
}
