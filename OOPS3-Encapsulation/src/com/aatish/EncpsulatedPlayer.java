package com.aatish;

public class EncpsulatedPlayer {

    private String name;
   // private int health = 100;
    // Changing name from health to playerHealth only in this class, no where else it is required.
    private int playerHealth = 100;
    private String weapon;

    public EncpsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health < 100) {
            this.playerHealth = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.playerHealth = this.playerHealth - damage;
        System.out.println("Remaining health" + this.playerHealth);
    }

    public int getHealth() {
        return this.playerHealth;
    }
}
