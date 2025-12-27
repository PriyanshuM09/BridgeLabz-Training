package com.constructors.levelone;

public class HotelBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	     HotelBooking b1 = new HotelBooking();
	    b1.displayBooking();

	 
	    HotelBooking b2 = new HotelBooking("Priyanshu", "Deluxe", 3);
	    b2.displayBooking();

	       HotelBooking b3 = new HotelBooking(b2);
	     b3.displayBooking();
	}

}
