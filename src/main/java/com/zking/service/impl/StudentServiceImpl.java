package com.zking.service.impl;

import com.zking.mapper.StudentMapper;
import com.zking.model.Student;
import com.zking.service.IStudentService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listStudent(Student stu, PageBean pageBean) {
        return studentMapper.listStudent(stu);
    }

    @Override
    public Student selStudent(Student stu) {
        return studentMapper.selStudent(stu);
    }


}
