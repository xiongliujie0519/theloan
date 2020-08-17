package com.zking.mapper;

import com.zking.model.Shooolmoney;
import com.zking.model.Student;
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
    //List<Shooolmoney> list(@Param("shooolmoney") Shooolmoney shooolmoney, PageBean pageBean);


    /**
     * 查询助学金(贷款金)
     * @param shooolmoney
     * @param pageBean
     * @return
     */
    //@Param("mtId2") Integer mtId2,@Param("mtId3") Integer mtId3
    List<Shooolmoney> listZxj(@Param("shooolmoney") Shooolmoney shooolmoney, PageBean pageBean,@Param("mtId1") Integer mtId1,@Param("mtId2") Integer mtId2,@Param("mtId3") Integer mtId3 );

    /**
     * 查看
     * @param
     * @return
     */
    Shooolmoney findMoneyById(@Param("maId") Integer maId);

    /**
     * 申请查询
     * @param smId
     * @return
     */
    Shooolmoney findMoneySQById(Integer smId);

    /**
     * 查询所有钱
     * @return
     */
    List<Shooolmoney> listMoney();


    /**
     * 查询发布任务信息
     * @param shooolmoney
     * @return
     */
    List<Shooolmoney> listShooolmoneyAll(Shooolmoney shooolmoney,@Param("mtName") String mtName);

    /**
     * 通过审核
     * @param shooolmoney
     * @return
     */
    int updateStatus(Shooolmoney shooolmoney);


}