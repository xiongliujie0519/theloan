package com.zking.mapper;

import com.zking.model.MoneyApply;
import com.zking.model.Shooolmoney;
import com.zking.model.Teacher;
import org.apache.ibatis.annotations.Param;
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

    //老师审核通过
    int teachershenhei(@Param("moneyApply") MoneyApply moneyApply, @Param("teacherId") Integer teacherId);


    //人事审核通过
    int renshishenhei(@Param("moneyApply") MoneyApply moneyApply, @Param("staffId") Integer staffId);

    //财务处理
    int caiwuchuli(@Param("moneyApply") MoneyApply moneyApply,@Param("staffId") Integer staffId);

}