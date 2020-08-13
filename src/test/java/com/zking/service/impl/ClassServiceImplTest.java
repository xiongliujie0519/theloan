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
    @Test
    public void selectTeacher(){
        cl=new Class();
        cl.setClassId(1);
        Class i = iClassService.selectTeacher(cl);
        System.out.println(i);
    }
    @Test
    public void selectStudent(){
        cl=new Class();
        cl.setClassId(3);
        List<Class> classes = iClassService.selectStudent(cl);
        for (Class aClass : classes) {
            System.out.println(aClass);
        }
    }
    @Test
    public void insertclass(){
        cl.setClassName("T257");
        int insertclass = iClassService.insertclass(cl);
        int i = iClassService.maxId();
        int i1 = iClassService.insertTeacherClass(1, i);
        System.out.println(insertclass);
        System.out.println(i);
        System.out.println(i1);
    }

@Test
    public  void updateTeacherName(){
    int i = iClassService.updateTeacherName(1, 20);
    System.out.println(i);
}
@Test
    public void fpstudent(){
    int fpstudent = iClassService.fpstudent(1, 6);
    System.out.println(fpstudent);

}



}