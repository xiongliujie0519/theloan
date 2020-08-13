package com.zking.service.impl;

import com.zking.mapper.StudentMapper;
import com.zking.model.Student;
import com.zking.service.IStudentMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMoneyServiceImpl implements IStudentMoneyService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public int updateMoney(Student student) {
        return studentMapper.updateMoney(student);
    }

    @Override
    public int findStudentCount() {
        return studentMapper.findStudentCount();
    }

    @Override
    public int findStudentDKCount() {
        return studentMapper.findStudentDKCount();
    }

    @Override
    public int findStudentZXJCount() {
        return studentMapper.findStudentZXJCount();
    }


}
