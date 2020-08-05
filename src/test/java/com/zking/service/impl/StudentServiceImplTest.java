package com.zking.service.impl;

import com.zking.model.Student;
import com.zking.service.IStudentService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceImplTest extends BaseTestCase {
@Autowired
private IStudentService studentService;
private Student student;
    @Before
    public void setUp() throws Exception {
        super.Before();
        student=new Student();
    }

    @Test
    public void listStudent() {
        pageBean.setRows(5);
        List<Student> students = studentService.listStudent(student, pageBean);
        for (Student s : students) {
            System.out.println(s);
        }
    }
    @Test
    public void selStudent(){
        //student.setStudentId(1);
        Student stu=new Student();
        stu.setStudentId(5);
        Student student = studentService.selStudent(stu);
        System.out.println(student);
    }
}