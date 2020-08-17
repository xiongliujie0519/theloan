package com.zking.mapper;

import com.zking.model.Student;
import com.zking.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    /*一对多*/
    Teacher finAll(Teacher teacher);
   //查看老师信息
    List<Teacher> listckteacher(Teacher teacher);

    //查看老师账号密码
    List<Teacher> listckNamePaw(Teacher teacher);

    //添加老师
    int insertTeacher(Teacher teacher);

    //修改老师信息
    int updateTeacher(Teacher teacher);

    //删除老师
    int delTeacher(Teacher teacher);

    /**
     *老师审核
     * @param teacher
     * @return
     */
    List<Teacher> teachershen(Teacher  teacher, @Param("mtName") String mtName,@Param("student") Student student);


    /***
     * 人事审核
     * @param teacher
     * @param mtName
     * @return
     */
    List<Teacher> renshishen(Teacher  teacher, @Param("mtName") String mtName,@Param("student") Student student);

    /**
     * 财务审核
     * @param mtName
     * @return
     */
    List<Teacher> caiwushen(@Param("mtName") String mtName);

    //根据userid查询出老师id
    Teacher getByuserId(Teacher teacher);

    //查询老师列
    Teacher selectTeacherLie(Teacher teacher);

    //修改老师列信息
    int updateTeacherLie(Teacher teacher);
}