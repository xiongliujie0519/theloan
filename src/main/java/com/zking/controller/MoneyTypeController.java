package com.zking.controller;

import com.zking.model.MoneyType;
import com.zking.service.IMoneyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("MoneyType")
public class MoneyTypeController {

    @Autowired
    private IMoneyTypeService moneyTypeService;

    @RequestMapping("MoneyTypeAll")
    @ResponseBody
    public Map<String,Object> MoneyTypeAll(){
        Map<String,Object> map = new HashMap<>();
        List<MoneyType> moneyTypes = moneyTypeService.MoneyTypeAll();
        if(moneyTypes!=null){
            map.put("rows",moneyTypes);
        }
        return  map;
    }

}
