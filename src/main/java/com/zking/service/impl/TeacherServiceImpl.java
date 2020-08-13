package com.zking.service.impl;

import com.zking.mapper.TeacherMapper;
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
}
