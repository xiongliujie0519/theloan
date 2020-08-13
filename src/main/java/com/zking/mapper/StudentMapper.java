package com.zking.mapper;

import com.zking.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 学生申请
     */
    int updateMoney(Student student);

    /**
     * 查询学生钱总数
     * @return
     */
    int findStudentCount();

    /**
     * 查询学生贷款钱总数
     * @return
     */
    int findStudentDKCount();

    /**
     * 查询学生助学钱总数
     * @return
     */
    int findStudentZXJCount();


}