package com.zking.service;

import com.zking.model.SysPermission;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;



public class ISysPermissionServiceTest extends BaseTestCase {

    @Autowired
    private  ISysPermissionService sysPermissionService;

    @Before
    public void setUp() throws Exception {
    }

//    @Test
//    public void queryrootNode() {
//        List<SysPermission> sysPermissions = sysPermissionService.queryrootNode();
//        for (SysPermission sysPermission : sysPermissions) {
//            System.out.println(sysPermission);
//        }
//    }
}