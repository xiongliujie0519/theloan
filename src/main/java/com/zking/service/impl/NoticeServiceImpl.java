package com.zking.service.impl;

import com.zking.mapper.NoticeMapper;
import com.zking.model.Notice;
import com.zking.service.INoticeService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements INoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Notice> listNotice(Notice notice , PageBean pageBean) {
        return noticeMapper.listNotice(notice);
    }

    @Override
    public int delNotice(Notice notice) {
        return noticeMapper.delNotice(notice);
    }

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

    @Override
    public List<Notice> listnotice(Notice notice, PageBean pageBean) {
        return noticeMapper.listnotice(notice);
    }

    @Override
    public List<Notice> indexNotice() {
        return noticeMapper.indexNotice();
    }
}
