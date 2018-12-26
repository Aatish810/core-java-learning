package com.aatish;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

//        int newScore = calculateScore("Parth", 25);
//        System.out.println("Total Score of above player is "+ newScore);
//
//        newScore = calculateScore(35);
//        System.out.println("Total score of unnamed player" + newScore);
//
//        calculateScore();
//
//        calculateScore(300, "ABD");
//
//    }

//    public static int calculateScore(String player, int score) {
//        System.out.println("Player has scored " + player + " " + score);
//        return score * 100;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed Player has scored " + score);
//        return score * 100;
//    }
//
//    public static void calculateScore() {
//        System.out.println("Unnamed Player and score is not defined");
//    }
//
//    public static int calculateScore(int score, String player) {
//        System.out.println(player + " scored " + score );
//        return 0;
//    }

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
