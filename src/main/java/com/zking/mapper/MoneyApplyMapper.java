package com.zking.mapper;

import com.zking.model.MoneyApply;
import com.zking.model.Shooolmoney;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyApplyMapper {
    int deleteByPrimaryKey(Integer maId);

    int insert(MoneyApply record);

    int insertSelective(MoneyApply record);

    MoneyApply selectByPrimaryKey(Integer maId);

    int updateByPrimaryKeySelective(MoneyApply record);

    int updateByPrimaryKey(MoneyApply record);


    //奖学金申请
    int updateJiangxuejin(Shooolmoney shooolmoney);

    int addMoney(MoneyApply moneyApply);
}