package com.zking.service.impl;

import com.zking.mapper.ShooolmoneyMapper;
import com.zking.model.Shooolmoney;
import com.zking.service.IShoolmoneyService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoolmoneyServiceImpl implements IShoolmoneyService {

    @Autowired
    private ShooolmoneyMapper shooolmoneyMapper;


    @Override
    public List<Shooolmoney> list(Shooolmoney shooolmoney,PageBean pageBean) {
        return shooolmoneyMapper.list(shooolmoney,pageBean);
    }
}
