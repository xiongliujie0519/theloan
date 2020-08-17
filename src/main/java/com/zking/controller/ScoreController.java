package com.zking.controller;

import com.zking.model.Class;
import com.zking.model.Score;
import com.zking.service.IClassService;
import com.zking.service.IScoreService;
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
@RequestMapping("ScoreController")
public class ScoreController {
   @Autowired
    private IScoreService iScoreService;
    private PageBean pageBean;
    @RequestMapping("updatescore")
    @ResponseBody
    public int updateScore(Score score, Model model){
        int i = iScoreService.updateScore(score);
     return i;
    }

    @RequestMapping("insertScore")
    @ResponseBody
    public Map<String,Object> insertScore(Model model,Score score){
        Map<String,Object> map = new HashMap<>();
        int i = iScoreService.insertSelective(score);
        if(i>0){
            map.put("index",1);
        }else{
            map.put("index",0);
        }
        return map;
    }


}
