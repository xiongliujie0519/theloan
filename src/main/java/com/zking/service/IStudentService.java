package com.zking.service;

import com.zking.mapper.StudentMapper;
import com.zking.model.Student;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
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

    /**
     * 绑定学生
     * @param student
     * @return
     */
    Student findStudent(Student student, String className);


    /**
     * 绑定学生
     * @param student
     * @return
     */
    int updateStudentUserid(Student student);

    //未通过
    int updatewtg( Student student);
    //已通过
    int updateytg(Student student);

    //财务处理状态
    int updatecaiwu(Student student);
}
