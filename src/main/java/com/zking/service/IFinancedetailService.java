package com.zking.service;

import com.zking.model.Financedetail;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IFinancedetailService {
    int deleteByPrimaryKey(Integer fdId);

    int insert(Financedetail record);

    int insertSelective(Financedetail record);

    Financedetail selectByPrimaryKey(Integer fdId);

    int updateByPrimaryKeySelective(Financedetail record);

    int updateByPrimaryKey(Financedetail record);

    /**
     *添加财务支出明细
     * @param financedetail
     * @return
     */
    int insertInfo(Financedetail financedetail);


    /**
     * 查询所有
     * @param financedetail
     * @return
     */
    List<Financedetail> listAll(Financedetail financedetail, PageBean pageBean);
}