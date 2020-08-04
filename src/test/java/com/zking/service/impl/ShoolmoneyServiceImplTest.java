package com.zking.service.impl;

import com.zking.model.Shooolmoney;
import com.zking.service.IShoolmoneyService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShoolmoneyServiceImplTest extends BaseTestCase {

    @Autowired
    private IShoolmoneyService iShoolmoneyService;
    private Shooolmoney shooolmoney;

    @Before
    public void setUp() throws Exception {
        super.Before();
        shooolmoney=new Shooolmoney();
    }

    @Test
    public void list() {
        //shooolmoney.setSmId(2);
        List<Shooolmoney> list = iShoolmoneyService.list();
        System.out.println(list);
    }
}