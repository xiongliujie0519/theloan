package com.zking.service.impl;

import com.zking.mapper.MoneyTypeMapper;
import com.zking.model.MoneyType;
import com.zking.service.IMoneyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyTypeServiceImpl implements IMoneyTypeService {
    @Autowired
    private MoneyTypeMapper moneyTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer mtId) {
        return 0;
    }

    @Override
    public int insert(MoneyType record) {
        return 0;
    }

    @Override
    public int insertSelective(MoneyType record) {
        return 0;
    }

    @Override
    public MoneyType selectByPrimaryKey(Integer mtId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(MoneyType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(MoneyType record) {
        return 0;
    }

    @Override
    public List<MoneyType> MoneyTypeAll() {
        return moneyTypeMapper.MoneyTypeAll();
    }
}
