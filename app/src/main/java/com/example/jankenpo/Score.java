package com.example.jankenpo;

public class Score {
    private static int scorePlayer;
    private static int scoreApp;

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer() {
        scorePlayer ++;
        System.out.println(this.scorePlayer);
    }

    public int getScoreApp() {
        return scoreApp;
    }

    public void setScoreApp() {
        System.out.println(this.scoreApp+"##");
        this.scoreApp ++;
        System.out.println(this.scoreApp);
    }
}
