package com.constructors.levelone;

public class LibraryBook{
    String title;
    String author;
    double price;
    boolean available;

   LibraryBook(String title, String author, double price){
      this.title =title;
      this.author =author;
     this.price =price;
     this.available=true;
    }

    void borrowBook(){
        if (available){
            available=false;
            System.out.println("Book borrowed successfully.");
        } 
       else{System.out.println("Sorry, the book is currently not available.");
        }
    }
    void displayDetails(){
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Price    : " + price);
        System.out.println("Available  : " + available);
        System.out.println();
    }

}
