package com.zking.mapper;

import com.zking.model.Class;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ClassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
//查看所有班级
    List<Class> listClass(Class cla);
//查看班级对应的老师
    Class selectTeacher(Class cla);
    //查看对应班级的学生
    List<Class> selectStudent(Class cla);

    //添加班级
    int insertclass(Class cla);
    //获取最大班级id
    int maxId();
    //添加老师和班级
    int insertTeacherClass(@Param("teacherId") Integer teacherId,@Param("classId") Integer classId);
    //修改老师姓名
    int updateTeacherName(@Param("teacherId") Integer teacherId,@Param("classId") Integer classId);

    //分配学生
    int fpstudent(@Param("classId") Integer classId,@Param("studentId") Integer studentId);
}