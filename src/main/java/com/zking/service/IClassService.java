package com.zking.service;

import com.zking.model.Class;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IClassService {
    @Transactional(readOnly = true)
    List<Class> listClass(Class cla, PageBean pageBean);
    Class selectTeacher(Class cla);
    List<Class> selectStudent(Class cla);
    int insertclass(Class cla);
    int maxId();
    int insertTeacherClass(Integer teacherId, Integer classId);
    int updateTeacherName( Integer teacherId,Integer classId);
    int fpstudent( Integer classId, Integer studentId);
}
