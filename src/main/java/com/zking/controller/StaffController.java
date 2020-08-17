package com.zking.controller;

import com.zking.model.Staff;
import com.zking.service.IStaffService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Staff")
public class StaffController {

    @Autowired
    private IStaffService staffService;

    @RequestMapping("listStaffAll")
    @ResponseBody
    public Map<String,Object> listStaffAll(Model model, Staff staff, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Staff> staffs = staffService.listStaffAll(staff, pageBean);
        if(staffs!=null){
            map.put("rows",staffs);
            map.put("total",pageBean.getTotal());
        }
        return map;
    }

    /**
     * 保存员工信息
     * @param staff
     * @return
     */
    @RequestMapping("SaveStaff")
    @ResponseBody
    public Map<String,Object> SaveStaff(Staff staff,Model model) {
        Map<String,Object> map = new HashMap<>();
        if(staff.getStaffId()!=null){
            int i = staffService.updateStaff(staff);
            if(i>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
        }else{
            int i = staffService.insertStaff(staff);
            if(i>0){
                map.put("msg",1);
            }else{
                map.put("msg",0);
            }
            System.out.println("增加");
        }
        return map;
    }


    /**
     * 根据staffId查询员工信息
     * @param model
     * @param staff
     * @return
     */
    @RequestMapping("getStaffByStaffId")
    @ResponseBody
    public Map<String,Object> getStaffByStaffId(Model model , Staff staff){
        Map<String,Object> map = new HashMap<>();
        System.out.println(staff.getStaffId());
        Staff staffByStaffId = staffService.getStaffByStaffId(staff);
        System.out.println(staffByStaffId);
        if(staffByStaffId!=null){
            map.put("msg",staffByStaffId);
        }else{
            map.put("msg","no");
        }
        return map;
    }


    /**
     * 删除员工角色桥接表
     * @param model
     * @param staff
     * @return
     */
    @RequestMapping("deleteStaff")
    @ResponseBody
    public Map<String,Object> deleteStaff(Model model,Staff staff){
        Map<String,Object> map = new HashMap<>();
        int i = staffService.deleteStaff(staff);
        int i1 = staffService.deleteStaffRole(staff);
        if(i>0){
            map.put("msg",1);
        }else{
            map.put("msg",0);
        }
        return map;
    }

    @RequestMapping("selectStaffLie")
    @ResponseBody
    public Map<String,Object> selectStaffLie(Model model, Staff staff){
        Map<String,Object> map = new HashMap<>();
        Staff sta = staffService.selectStaffLie(staff);
        staff.setStaffId(sta.getStaffId());
        if(sta.getUserId()!=null){
            map.put("msg","该员工已被绑定");
        }else{
            int staid = staffService.updateStaffLie(staff);
            if(staid>0){
                map.put("msg",1);
            }
            System.out.println(sta);
        }
        return map;
    }


    /**
     * 根据userid查询出员工id
     * @param model
     * @param staff
     * @return
     */
    @RequestMapping("getStaffId")
    @ResponseBody
    public Map<String,Object> getStaffId(Model model,Staff staff){
        Map<String,Object> map = new HashMap<>();
        Staff staffId = staffService.getStaffId(staff);
        if(staffId!=null){
            map.put("msg",staffId);
        }else{
            map.put("msg","no");
        }
        return map;
    }
}
