package com.zking.mapper;

import com.zking.model.Class;
import com.zking.model.Student;
import com.zking.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insertStudent(Student stu);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /*查看学生*/
   List<Student> listStudent(Student stu);


   /*根据id查询学生*/
    Student selStudent(Student stu);

    //修改学生
    int updateStudent(Student stu);

    //删除学生
    int delStudent(Student stu);

   //查看学生分数

    List<Student> scoreStudent(Student stu);

  //查看学生账号密码
    List<Student> listckNamePaw(Student stu);
  //根据班级查看学生
    List<Student> listclass(Student stu);
}