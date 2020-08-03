package com.zking.service.impl;

import com.zking.model.Teacher;
import com.zking.service.ITeacherService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TeacherServiceImplTest extends BaseTestCase {
@Autowired
private ITeacherService teacherService;
private Teacher teacher;

    @Before
    public void setUp() throws Exception {
    super.Before();
    teacher=new Teacher();
    }

    @Test
    public void finAll() {
        pageBean.setRows(2);
        teacher.setTeacherId(1);
        List<Teacher> teachers = teacherService.finAll(teacher, pageBean);
        for (Teacher t : teachers) {
            System.out.println(t);
        }

    }
}