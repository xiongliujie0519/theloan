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
    int updateStudent(Student stu);
    int delStudent(Student stu);
    int insertStudent(Student stu);
    List<Student> listscoreStudent(Student stu,PageBean pageBean);
    List<Student> listckNamePaw(Student stu,PageBean pageBean);
    List<Student> listclass(Student stu,PageBean pageBean);
}
