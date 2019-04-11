package com.aatish;

import static com.aatish.ThreadColor.ANSI_BLUE;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "From my runnable Class");
    }
}
