package com.aatish;

public class Main {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
	    new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }

    public static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1: has Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread1: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread2: has lock 2");
                }
                System.out.println("Thread1: Released lock 2");
            }
            System.out.println("Thread1: Released lock1. Exiting");
        }
    }
    public static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread2: has Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread2: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread2: has lock 2");
                }
                System.out.println("Thread2: Released lock 2");
            }
            System.out.println("Thread2: Released lock1. Exiting");
        }
    }
}
