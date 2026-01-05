package com.linkedlist.moviemanagementsystem;

public class MovieMain {
	    public static void main(String[] args) {

	        MovieLinkedList list = new MovieLinkedList();

	        list.addAtEnd("Inception", "Christopher Nolan", 2010, 9);
	        list.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8);
	        list.addAtPosition(2, "Titanic", "James Cameron", 1997, 8);

	        list.displayForward();
	        list.displayReverse();

	        list.searchByDirector("Christopher Nolan");
	        list.updateRating("Titanic", 9);
	        list.removeByTitle("Inception");

	        list.displayForward();
	    }
	}

	


