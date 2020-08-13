package com.zking.service;

import com.zking.mapper.NoticeMapper;
import com.zking.model.Notice;
import com.zking.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface INoticeService  {
    List<Notice> listNotice(Notice notice, PageBean pageBean);
    //删除公告
    int delNotice(Notice notice);
    //添加公告
    int insertNotice(Notice notice);
    //修改公告
    int updateNotice(Notice notice);
    List<Notice> listnotice(Notice notice ,PageBean pageBean);
}
