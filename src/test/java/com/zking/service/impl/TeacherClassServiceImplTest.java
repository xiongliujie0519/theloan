package com.zking.service.impl;

import com.zking.model.TeacherClass;
import com.zking.service.ITeacherClassService;
import com.zking.test.BaseTestCase;
import com.zking.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TeacherClassServiceImplTest extends BaseTestCase {
@Autowired
private ITeacherClassService iTeacherClassService;
private TeacherClass teacherClass;
    @Before
    public void setUp() throws Exception {
        super.Before();
        teacherClass=new TeacherClass();
        pageBean=new PageBean();
    }

    @Test
    public void allocationTeacher() {
        teacherClass.setClassId(15);
        teacherClass.setTeacherId(4);
        int i = iTeacherClassService.allocationTeacher(teacherClass);
        System.out.println(i);
    }
}