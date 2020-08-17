package com.zking.service.impl;

import com.zking.mapper.MoneyApplyMapper;
import com.zking.model.MoneyApply;
import com.zking.model.Teacher;
import com.zking.service.IMoneyApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyApplyServiceImpl implements IMoneyApplyService {

    @Autowired
    private MoneyApplyMapper moneyApplyMapper;

    @Override
    public int addMoney(MoneyApply moneyApply) {
        return moneyApplyMapper.addMoney(moneyApply);
    }

    @Override
    public int teachershenhei(MoneyApply moneyApply,Integer teacherId) {
        return moneyApplyMapper.teachershenhei(moneyApply,teacherId);
    }

    @Override
    public int renshishenhei(MoneyApply moneyApply, Integer staffId) {
        return moneyApplyMapper.renshishenhei(moneyApply,staffId);
    }

    @Override
    public int caiwuchuli(MoneyApply moneyApply, Integer staffId) {
        return moneyApplyMapper.caiwuchuli(moneyApply,staffId);
    }

}
