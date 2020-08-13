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
        student.setStudentId(5);
        Student studenta = studentService.selStudent(student);
        System.out.println(studenta);
    }

    @Test
    public  void updateStudent(){
        Student stu=new Student();
        stu.setStudentName("库里");
        stu.setStudentIdentity("88888888888");
        stu.setStudentSex("男");
        stu.setStudentAge(30);
        stu.setStudentAddress("fsdfsdgfd");
        stu.setStudentAncestral("汉族");
        stu.setStudentInfo("好");
        stu.setStudentTel("1008611");
        stu.setStudentId(5);
        int i = studentService.updateStudent(stu);
        System.out.println(i);
    }

    @Test
    public  void delStudnet(){
        Student stu =new Student();
        stu.setStudentId(5);
        int i = studentService.delStudent(stu);
        System.out.println(i);
    }

    @Test
    public void insertStudent(){
        Student stu=new Student();
        stu.setStudentName("傻狗1");
        stu.setStudentSex("女");
        stu.setStudentAge(19);
        stu.setStudentAddress("湖南长春");
        stu.setStudentIdentity("43062120030105493");
        stu.setStudentAncestral("汉族");
        stu.setStudentInfo("好");
        stu.setStudentTel("100861101");
        stu.setClassId(16);
        stu.setUserId(21);
        int i = studentService.insertStudent(stu);
        System.out.println(i);
    }

    @Test
    public  void scoreStudent(){
         pageBean.setRows(5);
        student=new Student();
        List<Student> students = studentService.listscoreStudent(student,pageBean);
        for (Student student1 : students) {
            System.out.println(student1);
        }

    }
    @Test
    public  void ckNamePwd(){
         pageBean.setRows(5);
        List<Student> students = studentService.listckNamePaw(student,pageBean);
        for (Student student1 : students) {
            System.out.println(student1);
        }

    }
     @Test
     public void listClass(){
        pageBean.setRows(5);
        student.setClassId(4);
         List<Student> students = studentService.listclass(student,pageBean);
         for (Student student1 : students) {
             System.out.println(student1);
         }

     }
}