package com.zking.controller;

import com.zking.model.Financedetail;
import com.zking.service.IFinancedetailService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Financedetail")
public class FinancedetailController {


    @Autowired
    private IFinancedetailService iFinancedetailService;

    @RequestMapping("listAll")
    @ResponseBody
    public Map<String,Object> listAll(Model model, Financedetail financedetail, PageBean pageBean, HttpServletRequest req){
        Map<String,Object> map = new HashMap<>();
        pageBean.setRows(4);
        pageBean.setRequest(req);
        List<Financedetail> financedetails = iFinancedetailService.listAll(financedetail, pageBean);
        if (financedetails!=null){
            map.put("rows",financedetails);
            map.put("total",pageBean.getTotal());
        }else{
            map.put("msg","no");
        }
        return map;
    }

}
