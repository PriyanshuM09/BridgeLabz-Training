package com.MovieTime;

public class Show {
    String movieName;
    int time;

    Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    void display() {
        System.out.println(movieName + " at " + time);
    }
}
