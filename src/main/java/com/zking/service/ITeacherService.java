package com.zking.service;

import com.zking.model.Student;
import com.zking.model.Teacher;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ITeacherService {
    /*一对多*/
    @Transactional(readOnly = true)
   Teacher finAll(Teacher teacher, PageBean pageBean);

    List<Teacher> listckteacher(Teacher teacher,PageBean pageBean);
    List<Teacher> listckNamePaw(Teacher teacher,PageBean pageBean);
    int insertTeacher(Teacher teacher);
    int updateTeacher(Teacher teacher);
    int delTeacher(Teacher teacher);



    /**
     *老师审核
     * @param teacher
     * @return
     */
    List<Teacher> listteachershen(Teacher  teacher,PageBean pageBean,String mtName,Student student);

   /***
    * 人事审核
    * @param teacher
    * @param mtName
    * @return
    */
   List<Teacher> listrenshishen(Teacher  teacher, @Param("mtName") String mtName,PageBean pageBean,Student student);

    /**
     * 财务审核
     * @param mtName
     * @return
     */
    List<Teacher> listcaiwushen(String mtName,PageBean pageBean);

    //查询老师列
    Teacher selectTeacherLie(Teacher teacher);

    //修改老师列信息
    int updateTeacherLie(Teacher teacher);

    //根据userid查询出老师id
    Teacher getByuserId(Teacher teacher);
}
