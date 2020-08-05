package com.zking.mapper;

import com.zking.model.Class;
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
}