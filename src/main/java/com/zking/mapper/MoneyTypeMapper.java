package com.zking.mapper;

import com.zking.model.MoneyType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoneyTypeMapper {
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