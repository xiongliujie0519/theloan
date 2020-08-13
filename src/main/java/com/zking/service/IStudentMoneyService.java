package com.zking.service;

import com.zking.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IStudentMoneyService {


    int updateMoney(Student student);

    int findStudentCount();

    int findStudentDKCount();

    int findStudentZXJCount();
}
