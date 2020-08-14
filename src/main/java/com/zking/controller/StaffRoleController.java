package com.zking.controller;

import com.zking.mapper.StaffRoleMapper;
import com.zking.model.Staff;
import com.zking.model.StaffRole;
import com.zking.service.IStaffRoleService;
import com.zking.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("StaffRole")
public class StaffRoleController {

    @Autowired
    private IStaffRoleService staffRoleService;

    @Autowired
    private IStaffService staffService;

    /**
     *
     * 保存授权信息
     * @param mode
     * @param staffRole
     * @return
     */
    @RequestMapping("saveStaffRole")
    @ResponseBody
    public Map<String,Object> saveStaffRole(Model mode, StaffRole staffRole, Staff staff){
        System.out.println(staffRole.toString());
        Map<String,Object> map = new HashMap<>();
        if(staffRole.getSrId()!=null){
            int update = staffRoleService.update(staffRole);
            int i = staffService.updateStaffCzr(staff);
            if(update>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }else{
            int insert = staffRoleService.insert(staffRole);
            int i = staffService.updateStaffCzr(staff);
            if(insert>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }
        return map;
    }
}
