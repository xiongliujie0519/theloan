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


    Shooolmoney findMoneyById(Integer maId);

    Shooolmoney findMoneySQById(Integer smId);

    List<Shooolmoney> listMoney();

    /**
     * 查询发布任务信息
     * @param shooolmoney
     * @return
     */
    List<Shooolmoney> listShooolmoneyAll(Shooolmoney shooolmoney,String mtName,PageBean pageBean);

    /**
     * 添加发布信息
     * @param shooolmoney
     * @return
     */
    int insert(Shooolmoney shooolmoney);

    /**
     * 通过审核
     * @param shooolmoney
     * @return
     */
    int updateStatus(Shooolmoney shooolmoney);

}
