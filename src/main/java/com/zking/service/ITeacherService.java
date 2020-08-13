package com.zking.service;

import com.zking.model.Student;
import com.zking.model.Teacher;
import com.zking.util.PageBean;
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
}
