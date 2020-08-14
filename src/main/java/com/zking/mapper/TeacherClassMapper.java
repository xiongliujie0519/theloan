package com.zking.mapper;

import com.zking.model.Teacher;
import com.zking.model.TeacherClass;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherClassMapper {
    int deleteByPrimaryKey(Integer tcId);

    int insert(TeacherClass record);

    int insertSelective(TeacherClass record);

    TeacherClass selectByPrimaryKey(Integer tcId);

    int updateByPrimaryKeySelective(TeacherClass record);

    int updateByPrimaryKey(TeacherClass record);

    int allocationTeacher(TeacherClass teacherClass);
}