package com.aatish;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Steve Roger", 2);

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("A",score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("B",score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("C",score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("D",score);
    }

    public static void displayHighScorePosition(String name, int positionInTable) {
        System.out.println(name + " managed to get position " + positionInTable + " in high score position");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if(playerScore > 1000) {
            position = 1;
        } else if(playerScore<= 1000 && playerScore > 500) {
             position =3;
        } else if(playerScore <= 500 && playerScore >= 100) {
             position =3;
        }
        return position;
    }
}
