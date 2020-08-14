package com.zking.service;

import com.zking.mapper.TeacherClassMapper;
import com.zking.mapper.TeacherMapper;
import com.zking.model.Teacher;
import com.zking.model.TeacherClass;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ITeacherClassService  {
    int allocationTeacher(TeacherClass teacherClass);
}
