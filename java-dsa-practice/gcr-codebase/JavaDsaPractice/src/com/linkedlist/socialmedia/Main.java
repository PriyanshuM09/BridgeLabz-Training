package com.linkedlist.socialmedia;

public class Main {
public static void main(String[]args) {
	SocialMediaList sm=new SocialMediaList();


    sm.addUser(1, "Suyash", 22);
    sm.addUser(2, "Aman", 23);
    sm.addUser(3, "Rohit", 21);
    sm.addUser(4, "Neha", 22);

    sm.addFriendConnection(1, 2);
    sm.addFriendConnection(1, 3);
    sm.addFriendConnection(2, 3);
    sm.addFriendConnection(2, 4);

    sm.displayFriends(1);
    sm.findMutualFriends(1, 2);
    sm.countFriends();

    sm.removeFriendConnection(1, 2);
    sm.displayFriends(1);

    //sm.searchByName("Rohit");
}
}
