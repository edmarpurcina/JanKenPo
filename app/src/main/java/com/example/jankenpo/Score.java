package com.example.jankenpo;

public class Score {
    private static int scorePlayer; // propriedade definida como static para poder ser incremental
    private static int scoreApp;
    private static int match;

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer() {
        Score.scorePlayer ++;
    }

    public void setScorePlayer(int newScore){
        Score.scorePlayer = newScore;
    }

    public int getScoreApp() {
        return scoreApp;
    }

    public void setScoreApp() {
        Score.scoreApp ++;
    }

    public void setScoreApp(int newScore){
        Score.scoreApp = newScore;
    }

    public int getMatch() {
        return match;
    }

    public void setScoreMatch() {
        Score.match ++;
    }

    public void setScoreMatch(int newScore){
        Score.match = newScore;
    }
}
