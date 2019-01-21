package com.aatish;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int strength;
    private int hitpoints;

    public Monster(String name, int strength, int hitpoints) {
        this.name = name;
        this.strength = strength;
        this.hitpoints = hitpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitpoints=" + hitpoints +
                '}';
    }

    @Override
    public List<String> write() {
        List<String>  values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, ""+ this.hitpoints);
        values.add(2, ""+ this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        this.name = savedValues.get(0);
        this.hitpoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));
    }
}
