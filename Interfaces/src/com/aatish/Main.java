package com.aatish;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234567);
        myPhone.answer();
        myPhone.callPhone(1234567);
        myPhone.powerOn();
        myPhone.dial(56887);
    }
}
