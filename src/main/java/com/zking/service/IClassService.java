package com.zking.service;

import com.zking.model.Class;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IClassService {
    @Transactional(readOnly = true)
    List<Class> listClass(Class cla, PageBean pageBean);
}
