package com.zking.mapper;

import com.zking.model.StaffRole;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRoleMapper {
    int insert(StaffRole staffRole);

    int insertSelective(StaffRole record);

    int update(StaffRole staffRole);
}