package com.zking.mapper;

import com.zking.model.StaffType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffTypeMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(StaffType record);

    int insertSelective(StaffType record);

    StaffType selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(StaffType record);

    int updateByPrimaryKey(StaffType record);

    /**
     * 查询所有部门类型信息
     * @return
     */
    List<StaffType> findStaffTypeAll();
}