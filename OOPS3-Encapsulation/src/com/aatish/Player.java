package com.aatish;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        System.out.println("Remaining health" + this.health);
    }

    public int getHealth() {
        return this.health;
    }

}
