package com.aatish;

import static com.aatish.ThreadColor.ANSI_BLUE;
import static com.aatish.ThreadColor.ANSI_PURPLE;
import static com.aatish.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ " 1. Hello from main thread");
        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another ===");
        anotherThread.start();
        new Thread() {
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_BLUE +  "from runnable in JAVA main");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_BLUE +  "Another thread finised or timedout");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_BLUE +  "I couldnot wait");
                }
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE+ "2. Hello from main thread");
    }
}
