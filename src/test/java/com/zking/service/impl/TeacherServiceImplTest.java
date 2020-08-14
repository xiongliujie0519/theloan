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
        Teacher teachers = teacherService.finAll(teacher, pageBean);
        System.out.println(teachers);

    }
    @Test
    public void ckteacher(){
    pageBean.setRows(1);
        for (Teacher teacher1 : teacherService.listckteacher(teacher,pageBean)) {
            System.out.println(teacher1);
        }
        ;
    }
    @Test
    public  void cknamepwd(){
        pageBean.setRows(1);
        List<Teacher> teachers = teacherService.listckNamePaw(teacher,pageBean);
        for (Teacher teacher1 : teachers) {
            System.out.println(teacher1);
        }
    }
    @Test
    public  void insertTeacher(){
        teacher=new Teacher();
        teacher.setTeacherName("熊流杰");
        teacher.setTeacherSex("男");
        teacher.setTeacherAddress("湖南长沙");
        teacher.setTeacherTel("1234567890");
        int i = teacherService.insertTeacher(teacher);
        System.out.println(i);
    }
    @Test
    public void  updateTeacher(){
        teacher.setTeacherName("熊流杰");
        teacher.setTeacherSex("女");
        teacher.setTeacherAddress("湖南长沙");
        teacher.setTeacherTel("1234567890");
        teacher.setTeacherId(5);
        int i = teacherService.updateTeacher(teacher);
        System.out.println(i);
    }
    @Test
    public  void delTeacher(){
        teacher.setTeacherId(7);
        int i = teacherService.delTeacher(teacher);
        System.out.println(i);
    }
}