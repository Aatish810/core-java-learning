package com.aatish;

import static com.aatish.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hello from another thread" + currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_GREEN+ " Another thread interrupted");
            return;
        }
        System.out.println(ANSI_GREEN+ "Thread woke up after 3 seconds");
    }
}
