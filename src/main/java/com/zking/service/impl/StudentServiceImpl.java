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

    @Override
    public int updateStudent(Student stu) {
        return studentMapper.updateStudent(stu);
    }

    @Override
    public int delStudent(Student stu) {
        return studentMapper.delStudent(stu);
    }

    @Override
    public int insertStudent(Student stu) {
        return studentMapper.insertStudent(stu);
    }

    @Override
    public List<Student> listscoreStudent(Student stu,PageBean pageBean) {
        return studentMapper.scoreStudent(stu);
    }

    @Override
    public List<Student> listckNamePaw(Student stu,PageBean pageBean) {
        return studentMapper.listckNamePaw(stu);
    }

    @Override
    public List<Student> listclass(Student stu, PageBean pageBean) {
        return studentMapper.listclass(stu);
    }

    @Override
    public Student findStudent(Student student, String className) {
        return studentMapper.findStudentByid(student,className);
    }

    @Override
    public int updateStudentUserid(Student student) {
        return studentMapper.updateStudentUserid(student);
    }

    @Override
    public int updatewtg(Student student) {
        return studentMapper.updatewtg(student);
    }

    @Override
    public int updateytg(Student student) {
        return studentMapper.updateytg(student);
    }

    @Override
    public int updatecaiwu(Student student) {
        return studentMapper.updatecaiwu(student);
    }


}
