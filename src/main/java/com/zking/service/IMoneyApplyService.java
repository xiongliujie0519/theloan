package com.zking.service;

import com.zking.model.MoneyApply;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMoneyApplyService {

    int addMoney(MoneyApply moneyApply);
}
