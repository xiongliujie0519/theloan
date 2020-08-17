package com.zking.service.impl;

import com.zking.mapper.FinancedetailMapper;
import com.zking.model.Financedetail;
import com.zking.service.IFinancedetailService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancedetailServiceImpl implements IFinancedetailService {

    @Autowired
    private FinancedetailMapper financedetailMapper;

    @Override
    public int deleteByPrimaryKey(Integer fdId) {
        return 0;
    }

    @Override
    public int insert(Financedetail record) {
        return 0;
    }

    @Override
    public int insertSelective(Financedetail record) {
        return 0;
    }

    @Override
    public Financedetail selectByPrimaryKey(Integer fdId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Financedetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Financedetail record) {
        return 0;
    }

    @Override
    public int insertInfo(Financedetail financedetail) {
        return financedetailMapper.insertInfo(financedetail);
    }

    @Override
    public List<Financedetail> listAll(Financedetail financedetail, PageBean pageBean) {
        return financedetailMapper.listAll(financedetail);
    }
}
