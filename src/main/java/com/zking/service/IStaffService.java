package com.zking.service;

import com.zking.model.Staff;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IStaffService {
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
    @Transactional(readOnly = true)
    List<Staff> listStaffAll(Staff staff, PageBean pageBean);

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

    Staff selectStaffLie(Staff staff);

    int updateStaffLie(Staff staff);

    //根据usrid查询出员工id
    Staff getStaffId(Staff staff);
}