package com.aatish;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Parth", 25);
        System.out.println("Total Score of above player is "+ newScore);

        newScore = calculateScore(35);
        System.out.println("Total score of unnamed player" + newScore);

        calculateScore();

    }

    public static int calculateScore(String player, int score) {
        System.out.println("Player has scored " + player + " " + score);
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player has scored " + score);
        return score * 100;
    }

    public static void calculateScore() {
        System.out.println("Unnamed Player and score is not defined");
    }


}
