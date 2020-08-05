package com.zking.service.impl;

import com.zking.mapper.StaffTypeMapper;
import com.zking.model.StaffType;
import com.zking.service.IStaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffTypeServiceImpl implements IStaffTypeService {

    @Autowired
    private StaffTypeMapper staffTypeMapper;


    @Override
    public int deleteByPrimaryKey(Integer stId) {
        return 0;
    }

    @Override
    public int insert(StaffType record) {
        return 0;
    }

    @Override
    public int insertSelective(StaffType record) {
        return 0;
    }

    @Override
    public StaffType selectByPrimaryKey(Integer stId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StaffType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StaffType record) {
        return 0;
    }

    @Override
    public List<StaffType> findStaffTypeAll() {
        return staffTypeMapper.findStaffTypeAll();
    }
}
