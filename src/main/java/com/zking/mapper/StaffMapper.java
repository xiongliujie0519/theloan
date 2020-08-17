package com.zking.mapper;

import com.zking.model.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    /**
     * 查询所有员工信息并且根据staff_name模糊查询
     * @param staff
     * @return
     */
    List<Staff> listStaffAll(Staff staff);

    /**
     * 修改员工信息
     * @param staff
     * @return
     */
    int updateStaff(Staff staff);

    /**
     * 添加员工信息
     * @param staff
     * @return
     */
    int insertStaff(Staff staff);

    /**
     * 根据staffId查询员工信息
     * @param staff
     * @return
     */
    Staff getStaffByStaffId(Staff staff);


    /**
     * 修改最后员工操作人
     * @param staff
     * @return
     */
    int updateStaffCzr(Staff staff);

    /**
     * 删除员工表信息
     * @param staff
     * @return
     */
    int deleteStaff(Staff staff);

    /**
     * 删除员工角色桥接表信息
     * @return
     */
    int deleteStaffRole(Staff staff);

    //查询员工列
    Staff selectStaffLie(@Param("staff") Staff staff);

    //修改员工列信息
    int updateStaffLie(Staff staff);

    //根据usrid查询出员工id
    Staff getStaffId(Staff staff);
}