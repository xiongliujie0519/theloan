package com.zking.mapper;

import com.zking.model.Notice;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer noticeId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    //查询公告
    List<Notice> listNotice(Notice notice);
    //删除公告
    int delNotice(Notice notice);
    //添加公告
    int insertNotice(Notice notice);
    //修改公告
    int updateNotice(Notice notice);
    //发布公告
    List<Notice> listnotice(Notice notice);
}