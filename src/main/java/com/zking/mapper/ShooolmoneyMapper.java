package com.zking.mapper;

import com.zking.model.Shooolmoney;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ShooolmoneyMapper {
    int deleteByPrimaryKey(Integer smId);

    int insert(Shooolmoney record);

    int insertSelective(Shooolmoney record);

    Shooolmoney selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(Shooolmoney record);

    int updateByPrimaryKey(Shooolmoney record);

    /**
     * 查询奖学金
     * @param shooolmoney
     * @param pageBean
     * @return
     */
    List<Shooolmoney> list(@Param("shooolmoney") Shooolmoney shooolmoney, PageBean pageBean);



}