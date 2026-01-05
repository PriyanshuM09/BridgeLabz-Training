package com.linkedlist.moviemanagementsystem;
import java.util.*;
class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode  prev;
    MovieNode next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
