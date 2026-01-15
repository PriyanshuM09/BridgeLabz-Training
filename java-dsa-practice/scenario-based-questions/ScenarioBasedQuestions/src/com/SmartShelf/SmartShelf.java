package com.SmartShelf;

public class SmartShelf {
public static void sortByTitle(Book[] books) {
	
	for(int i=0;i<books.length;i++) {
		Book key=books[i];
		int j=i-1;
		
		while(j>=0&& books[j].title.compareToIgnoreCase(key.title)>0) {
			  books[j + 1] = books[j];
              j--;
		}
		books[j + 1] = key;
	}
}
public static void displayShelf(Book[] books) {
    for (Book b : books) {
        b.display();
    }

}
}
