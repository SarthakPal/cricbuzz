package com.example.cricbuzz.model.people;

import com.example.cricbuzz.exception.InvalidMatch;
import com.example.cricbuzz.model.match.Ball;
import com.example.cricbuzz.model.match.ScoreCard;

public class Scorer extends Person {
    public Scorer(String name) {
        super(name);
    }

    public void setScore(Ball ball, String match, int innings) throws InvalidMatch {
        ScoreCard scoreCard = ScoreCard.INSTANCE(match, innings);
        scoreCard.setScoreCardForBall(ball);
    }
}
