package com.zking.service;

import com.zking.model.StaffType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStaffTypeService {
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
    @Transactional(readOnly = true)
    List<StaffType> findStaffTypeAll();
}