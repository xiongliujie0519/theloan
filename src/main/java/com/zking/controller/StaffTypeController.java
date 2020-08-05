package com.zking.controller;

import com.zking.model.StaffType;
import com.zking.service.IStaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("StaffType")
public class StaffTypeController {

    @Autowired
    private IStaffTypeService staffTypeService;

    /**
     * 查看部门类型信息
     * @return
     */
    @RequestMapping("findStaffTypeAll")
    @ResponseBody
    public Map<String,Object> findStaffTypeAll(){
        Map<String,Object> map = new HashMap<>();
        List<StaffType> staffTypeAll = staffTypeService.findStaffTypeAll();
        if(staffTypeAll.size()>0){
            map.put("rows",staffTypeAll);
        }else{
            map.put("msg","n");
        }
        return map;
    }
}
