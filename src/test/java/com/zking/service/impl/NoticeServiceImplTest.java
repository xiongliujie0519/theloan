package com.zking.service.impl;

import com.zking.model.Notice;
import com.zking.service.INoticeService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class NoticeServiceImplTest extends BaseTestCase {
@Autowired
    private INoticeService iNoticeService;
    private Notice notice;
    @Before
    public void setUp() throws Exception {
        super.Before();
    }

    @Test
    public void listNotice() {
      pageBean.setRows(2);
        List<Notice> notices = iNoticeService.listNotice(notice, pageBean);
        for (Notice notice1 : notices) {
            System.out.println(notice1);
        }

    }

    @Test
    public void listnotice() {
        pageBean.setRows(2);
        List<Notice> notices = iNoticeService.listnotice(notice, pageBean);
        for (Notice notice1 : notices) {
            System.out.println(notice1);
        }

    }

    @Test
    public void delNotice() {
        notice=new Notice();
        notice.setNoticeId(5);
        int i = iNoticeService.delNotice(notice);
        System.out.println(i);
    }

    @Test
    public void insertNotice() {
        notice=new Notice();
        notice.setNoticeTitle("aa");
        notice.setNoticeCentent("规定");
        int i = iNoticeService.insertNotice(notice);
        System.out.println(i);
    }

    @Test
    public void updateNotice() {
        notice=new Notice();
        notice.setNoticeTitle("bb");
        notice.setNoticeCentent("fsa");
        notice.setNoticeId(5);
        int i = iNoticeService.updateNotice(notice);
        System.out.println(i);
    }
}