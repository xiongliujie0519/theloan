package com.zking.controller;

import com.zking.model.Notice;
import com.zking.service.INoticeService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("NoticeController")
public class NoticeController {
    @Autowired
    private INoticeService iNoticeService;
    private PageBean pageBean;

    //查询公告
    @RequestMapping("selNotice")
    @ResponseBody
    public Map<String,Object> listNotice(Notice notice,HttpServletRequest req){
        pageBean=new PageBean();
        pageBean.setRows(5);
        pageBean.setRequest(req);
        List<Notice> notices = iNoticeService.listNotice(notice, pageBean);
        for (Notice notice1 : notices) {
            System.out.println(notice1);
        }
     Map<String,Object> map=new HashMap<>();
        map.put("rows",notices);
        map.put("tools",pageBean.getTotal());
        return map;
    }
    //添加公告
    @RequestMapping("insertNotice")
    @ResponseBody
    public int insertNotice(Model model,Notice notice){
        int i = iNoticeService.insertNotice(notice);
       return i;
    }

    //修改公告
    @RequestMapping("updateNotice")
    @ResponseBody
    public int updateNotice(Model model,Notice notice){
        int i = iNoticeService.updateNotice(notice);
        return i;
    }
    //删除公告
    @RequestMapping("delNotice")
    @ResponseBody
    public  int delNotice(Model model,Notice notice){
        int i = iNoticeService.delNotice(notice);
        return i;
    }


    //首页显示公告
    @RequestMapping("indexNotice")
    @ResponseBody
    public Map<String,Object> indexNotice(){
        Map<String,Object> map = new HashMap<>();
        List<Notice> notices = iNoticeService.indexNotice();
        if (notices!=null){
            map.put("rows",notices);
        }
        return map;
    }

}
