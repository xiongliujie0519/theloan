package com.zking.service.impl;

import com.zking.model.Score;
import com.zking.service.IScoreService;
import com.zking.test.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ScoreServiceImplTest extends BaseTestCase {
@Autowired
    private IScoreService iScoreService;
    private Score score;
    @Before
    public void setUp() throws Exception {
        super.Before();
        score=new Score();
    }

    @Test
    public void updateScore() {
        score.setScore(68);
        score.setScoreId(1);
        int i = iScoreService.updateScore(score);
        System.out.println(i);


    }
}