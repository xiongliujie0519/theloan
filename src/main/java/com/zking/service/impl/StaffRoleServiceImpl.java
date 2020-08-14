package com.zking.service.impl;

import com.zking.mapper.StaffRoleMapper;
import com.zking.model.StaffRole;
import com.zking.service.IStaffRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffRoleServiceImpl implements IStaffRoleService {

    @Autowired
    private StaffRoleMapper staffRoleMapper;

    @Override
    public int insert(StaffRole staffRole) {
        return staffRoleMapper.insert(staffRole);
    }

    @Override
    public int insertSelective(StaffRole record) {
        return 0;
    }

    @Override
    public int update(StaffRole staffRole) {
        return staffRoleMapper.update(staffRole);
    }
}
