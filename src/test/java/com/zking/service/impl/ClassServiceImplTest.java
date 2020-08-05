package com.zking.service.impl;

import com.zking.model.Class;
import com.zking.model.Teacher;
import com.zking.service.IClassService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ClassServiceImplTest extends BaseTestCase {
    @Autowired
    private IClassService iClassService;
    private Class cl;
    @Before
    public void setUp() throws Exception {
        super.Before();
        cl=new Class();
    }
    @Test
    public void listClass() {
        pageBean.setRows(2);
        List<Class> classes = iClassService.listClass(cl,pageBean);
        for (Class aClass : classes) {
            System.out.println(aClass);
        }


    }
}