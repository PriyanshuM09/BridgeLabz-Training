package com.BookShelf;

import java.util.Objects;

public class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return title.equalsIgnoreCase(b.title) &&
               author.equalsIgnoreCase(b.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    @Override
    public String toString(){
        return title + " by " + author;
    }
}
