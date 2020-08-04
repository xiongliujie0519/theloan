package com.zking.mapper;

import com.zking.model.Shooolmoney;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShooolmoneyMapper {
    int deleteByPrimaryKey(Integer smId);

    int insert(Shooolmoney record);

    int insertSelective(Shooolmoney record);

    Shooolmoney selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(Shooolmoney record);

    int updateByPrimaryKey(Shooolmoney record);

    List<Shooolmoney> list();

}