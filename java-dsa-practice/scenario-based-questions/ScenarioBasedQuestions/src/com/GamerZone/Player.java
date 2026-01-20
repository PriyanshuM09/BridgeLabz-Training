package com.GamerZone;

public class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println(name + " - " + score);
    }
}
