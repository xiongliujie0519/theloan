package com.zking.service;

import com.zking.model.MoneyType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IMoneyTypeService {
    int deleteByPrimaryKey(Integer mtId);

    int insert(MoneyType record);

    int insertSelective(MoneyType record);

    MoneyType selectByPrimaryKey(Integer mtId);

    int updateByPrimaryKeySelective(MoneyType record);

    int updateByPrimaryKey(MoneyType record);

    /**
     * 查询所有奖金类型
     * @return
     */
    List<MoneyType> MoneyTypeAll();
}