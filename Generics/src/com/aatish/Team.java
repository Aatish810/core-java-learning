package com.aatish;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already team " + this.name);
            return false;
        } else {
            this.members.add(player);
            System.out.println(player.getName() + " is in team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } if(ourScore < theirScore) {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking() {
        return (won*2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
          return -1;
        } else if (this.ranking() < team.ranking()) {
            return 0;
        } else {
            return 0;
        }
    }
}
