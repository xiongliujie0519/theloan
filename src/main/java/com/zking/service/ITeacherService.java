package com.zking.service;

import com.zking.model.Teacher;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ITeacherService {
    /*一对多*/
    @Transactional(readOnly = true)
    List<Teacher> finAll(Teacher teacher, PageBean pageBean);
}
