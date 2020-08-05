package com.zking.mapper;

import com.zking.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /*查看学生*/
   List<Student> listStudent(Student stu);


   /*根据id查询学生*/
    Student selStudent(Student stu);


}