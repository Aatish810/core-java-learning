package com.aatish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        char switchValue = 'C';
//        switch(switchValue) {
//            case 'A':
//            System.out.println("value was A");
//            break;
//            case 'B':
//                System.out.println("Value was B");
//                break;
//            case 'C': case 'D':
//                System.out.println("Value was C or D");
//                break;
//                default:
//                    System.out.println("Value not found");
//                    break;
//        }

        // DAY OF WEEK CHALLENGE
//        System.out.println(printDayOfWeek(9));
//        System.out.println(findingDayOfWeek(6));
//        System.out.println(sumOfNumber());
//        System.out.println(getGreatestCommonDivisor(15, 25));
//        System.out.println(isPrefectNumber(6));
//        parsingStringToDouble();
//        parsingStringToInt();
      //  readingUserInputChallenge();
        minMaxChallenge();
    }

    public static String printDayOfWeek(int day) {
        String foundDay;
        switch (day) {
            case 0:
                foundDay = "Sunday";
                break;
            case 1:
                foundDay = "Monday";
                break;
            case 2:
                foundDay = "Tuesday";
                break;
            case 3:
                foundDay = "Wednesday";
                break;
            case 4:
                foundDay = "Thursday";
                break;
            case 5:
                foundDay = "Friday";
                break;
            case 6:
                foundDay = "Saturday";
                break;
                default:
                    foundDay = "Invalid Number";
                    break;
        }
        return foundDay;
    }

    public static String findingDayOfWeek(int day) {
        String foundDay = "";
        if(day == 0) {
            foundDay = "Sunday";
        } else if (day == 1) {
            foundDay = "Monday";
        } else if (day == 2) {
            foundDay = "Tuesday";
        } else if (day == 3) {
            foundDay = "Wednesday";
        } else if (day == 4) {
            foundDay = "Thursday";
        } else if (day == 5) {
            foundDay = "Friday";
        } else if (day == 6) {
           return foundDay = "Saturday";
        }
        return foundDay;
    }

    public static int sumOfNumber() {
        int counter = 0;
        int sumOfNumber = 0;
        for(int i = 3; i <= 1000; i++) {
            if((i%3 == 0) || (i%5 == 0)) {
                counter++;
                System.out.println(i);
                sumOfNumber = sumOfNumber + i;
            }
            if(counter == 5) {
                break;
            }
        }
        return sumOfNumber;
    }

    // Finding Greatest Common Divisor.
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 10 || num2 < 10){
            return -1;
        }

        int counter = num1 > num2 ? num2 : num1;

        while(counter != 0){

            if((num1 % counter == 0) && (num2 % counter == 0)){
                return counter;
            }

            counter--;
        }

        return -1;
    }

    // finding perfect number
    public static boolean isPrefectNumber(int num) {
        boolean check = false;
        int sum = 0;
        if(num< 1) {
            check = false;
        } else {
            int counter = 1;
            do {
                if(num%counter == 0) {
                    sum = sum + counter;
                }
                counter++;
            } while(counter< num);
            if(sum == num) {
                System.out.println("hit");
                check = true;
            }
        }
        return check;
    }

    public static void parsingStringToInt() {
        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString);
        System.out.println("Converted to Int from string " + number);
    }

    public static void parsingStringToDouble() {
        String doubleAsString = "2018.125";
        double number = Double.parseDouble(doubleAsString);
        System.out.println("Converted to double from string " + number);
    }


    // Reading input from user and handling
    public static void readingUserInputChallenge() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        // using scanner for Strings
        // String str = scanner.nextLine();
        do {
            System.out.println("Enter Number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                // for number type data
            int number = scanner.nextInt();
            scanner.nextLine();
                System.out.println("You entered " + number);
                sum = sum +number;
            } else {
                System.out.println("You entered wrong value");
                break;
            }
            count++;
        } while(count<=10);
        System.out.println("Sum of numbers " + sum);
        scanner.close();
    }

    // min and max challenge
    public static void minMaxChallenge() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counter = 0;
        while(true) {
            System.out.println("Enter number as many u want");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int a = scanner.nextInt();
                if(counter == 0) {
                    min = a;
                    max = a;
                    counter++;
                } if(a< min && counter == 1) {
                    min = a;
                } if(a> max && counter == 1) {
                    max = a;
                }
            } else {
                System.out.println("Min value is " + min);
                System.out.println("Max value is " + max);
                break;
            }
        }
        scanner.close();
    }
}
