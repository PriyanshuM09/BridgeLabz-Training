package com.constructors.levelone;

public class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking(){
        guestName = "Not Assigned";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking booking){
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void displayBooking(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
        System.out.println();
    }
}
