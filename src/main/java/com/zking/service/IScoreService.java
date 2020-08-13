package com.zking.service;

import com.zking.mapper.ScoreMapper;
import com.zking.model.Score;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IScoreService  {
    int updateScore(Score score);
}
