package com.zking.service;

import com.zking.model.MoneyApply;
import com.zking.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMoneyApplyService {

    int addMoney(MoneyApply moneyApply);

    //审核通过
    int teachershenhei(MoneyApply moneyApply,Integer teacherId);

    //人事审核通过
    int renshishenhei(MoneyApply moneyApply, Integer staffId);

    //财务处理
    int caiwuchuli(MoneyApply moneyApply,Integer staffId);

}
