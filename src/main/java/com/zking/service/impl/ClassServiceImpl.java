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
}
