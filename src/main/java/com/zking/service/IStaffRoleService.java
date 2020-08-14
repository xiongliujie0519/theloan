package com.zking.service;

import com.zking.model.StaffRole;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IStaffRoleService {
    int insert(StaffRole staffRole);

    int insertSelective(StaffRole record);

    int update(StaffRole staffRole);
}