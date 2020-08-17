package com.zking.service.impl;

import com.github.pagehelper.Page;
import com.zking.mapper.ShooolmoneyMapper;
import com.zking.model.Shooolmoney;
import com.zking.service.IShoolmoneyService;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoolmoneyServiceImpl implements IShoolmoneyService {

    @Autowired
    private ShooolmoneyMapper shooolmoneyMapper;


   /* @Override
    public List<Shooolmoney> list(Shooolmoney shooolmoney,PageBean pageBean) {
        return shooolmoneyMapper.list(shooolmoney,pageBean);
    }*/

    @Override
    public List<Shooolmoney> listZxj(Shooolmoney shooolmoney, PageBean pageBean,Integer mtId1,Integer mtId2,Integer mtId3) {
        return shooolmoneyMapper.listZxj(shooolmoney,pageBean,mtId1,mtId2,mtId3);
    }

    @Override
    public Shooolmoney findMoneyById(Integer maId) {
        return shooolmoneyMapper.findMoneyById(maId);
    }

    @Override
    public Shooolmoney findMoneySQById(Integer smId) {
        return shooolmoneyMapper.findMoneySQById(smId);
    }

    @Override
    public List<Shooolmoney> listMoney() {
        return shooolmoneyMapper.listMoney();
    }

    @Override
    public List<Shooolmoney> listShooolmoneyAll(Shooolmoney shooolmoney, String mtName, PageBean pageBean) {
        return shooolmoneyMapper.listShooolmoneyAll(shooolmoney,mtName);
    }

    @Override
    public int insert(Shooolmoney shooolmoney) {
        return shooolmoneyMapper.insert(shooolmoney);
    }

    @Override
    public int updateStatus(Shooolmoney shooolmoney) {
        return shooolmoneyMapper.updateStatus(shooolmoney);
    }
}
