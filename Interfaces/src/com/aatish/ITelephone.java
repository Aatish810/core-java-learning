package com.aatish;

public interface ITelephone {
    void powerOn();
    void dial(int number);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
