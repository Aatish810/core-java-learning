package com.aatish;

public class Main {

    public static void main(String[] args) {

        // int byte short long working
        byte byteNumber = 10;
        short shortNumber = 129;
        int intNumber = 365;
        long longNumber = 50000 + (10* (byteNumber + shortNumber + intNumber));
        short resultShort = (short) (50000 + (10* (byteNumber + intNumber)));
        System.out.println(longNumber);
        System.out.println(resultShort);

        // Float Double
        float floatNumber = 2.5f;
        double doubleNumber = 2.555;

        // char and boolean
        char name = 'a';
        boolean x = false;
        // using a unicode char for say copyright symbol
        char a = '\u00A9';
        System.out.println(a);

        // Strings

        System.out.println();

    }
}
