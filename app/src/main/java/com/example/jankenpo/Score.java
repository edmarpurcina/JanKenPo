package com.example.jankenpo;

public class Score {
    private int scorePlayer = 0;
    private int scoreApp = 0;

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer(int score) {
        scorePlayer = this.scorePlayer + score;
        System.out.println(this.scorePlayer);
    }

    public int getScoreApp() {
        return scoreApp;
    }

    public void setScoreApp(int score) {
        this.scoreApp += this.scoreApp + score;
        System.out.println(this.scoreApp);
    }
}
