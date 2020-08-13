package com.zking.service;

import com.zking.model.Shooolmoney;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IShoolmoneyService {

    //List<Shooolmoney> list(Shooolmoney shooolmoney,PageBean pageBean);


    //Integer mtId1,Integer mtId2,Integer mtId3
    List<Shooolmoney> listZxj(Shooolmoney shooolmoney, PageBean pageBean,Integer mtId1,Integer mtId2,Integer mtId3);


    Shooolmoney findMoneyById(Integer smId);

    List<Shooolmoney> listMoney();

}
