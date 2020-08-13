package com.zking.mapper;

import com.zking.model.Score;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreMapper {
    int deleteByPrimaryKey(Integer scoreId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer scoreId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    //修改分数
    int updateScore(Score score);
}