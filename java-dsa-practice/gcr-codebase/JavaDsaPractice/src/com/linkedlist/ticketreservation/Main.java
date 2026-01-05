package com.linkedlist.ticketreservation;

public class Main {

	    public static void main(String[] args) {

	       TicketList tickets = new TicketList();

	        tickets.addTicket(101, "Suyash", "Interstellar", "A12", "10:30 AM");
	        tickets.addTicket(102, "jay", "Inception", "B15", "11:00 AM");
	        tickets.addTicket(103, "raj", "Interstellar", "A13", "11:15 AM");

	        tickets.displayTickets();

	        System.out.println("Search Result:");
	        tickets.searchTicket("Interstellar");

	        System.out.println("Total Tickets: " + tickets.countTickets());

	        tickets.removeTicket(102);
	        tickets.displayTickets();
	    }
	}


