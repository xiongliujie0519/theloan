package com.zking.model;

public class Score {
    private Integer scoreId;

    private String scoreCourse;

    private Integer studentId;

    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Score(Integer scoreId, String scoreCourse, Integer studentId) {
        this.scoreId = scoreId;
        this.scoreCourse = scoreCourse;
        this.studentId = studentId;
    }

    public Score() {
        super();
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getScoreCourse() {
        return scoreCourse;
    }

    public void setScoreCourse(String scoreCourse) {
        this.scoreCourse = scoreCourse;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}