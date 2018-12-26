package com.aatish;

public class Vechile {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vechile(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Steering at " + this.currentDirection + " degree");
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Velocity is " + this.currentVelocity + " Direction is " + this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }

}
