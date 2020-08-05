package com.zking.service;

import com.zking.mapper.StudentMapper;
import com.zking.model.Student;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IStudentService  {
    List<Student> listStudent(Student stu, PageBean pageBean);

    Student selStudent(Student stu);
}
