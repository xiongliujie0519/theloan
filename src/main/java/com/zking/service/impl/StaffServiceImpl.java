package com.zking.service.impl;

import com.zking.mapper.StaffMapper;
import com.zking.model.Staff;
import com.zking.service.IStaffService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public int deleteByPrimaryKey(Integer staffId) {
        return 0;
    }

    @Override
    public int insert(Staff record) {
        return 0;
    }

    @Override
    public int insertSelective(Staff record) {
        return 0;
    }

    @Override
    public Staff selectByPrimaryKey(Integer staffId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Staff record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Staff record) {
        return 0;
    }

    @Override
    public List<Staff> listStaffAll(Staff staff,PageBean pageBean) {
        return staffMapper.listStaffAll(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffMapper.updateStaff(staff);
    }

    @Override
    public int insertStaff(Staff staff) {
        return staffMapper.insertStaff(staff);
    }

    @Override
    public Staff getStaffByStaffId(Staff staff) {
        return staffMapper.getStaffByStaffId(staff);
    }

    @Override
    public int updateStaffCzr(Staff staff) {
        return staffMapper.updateStaffCzr(staff);
    }

    @Override
    public int deleteStaff(Staff staff) {
        return staffMapper.deleteStaff(staff);
    }

    @Override
    public int deleteStaffRole(Staff staff) {
        return staffMapper.deleteStaffRole(staff);
    }
}
