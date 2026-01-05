package com.linkedlist.ticketreservation;

public class TicketList {
	
	    private TicketNode head = null;
	    public void addTicket(int id, String customer, String movie,
	                          String seat, String time) {
	        TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

	        if (head == null) {
	            head = newTicket;
	            newTicket.next = head; 
	            return;
	        }

	        TicketNode temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }
	        temp.next = newTicket;
	        newTicket.next = head;
	    }

	    public void removeTicket(int ticketId) {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        TicketNode curr=head, prev=null;

	        do {
	            if (curr.ticketId == ticketId) {
	                if (curr == head && curr.next == head) {
	                    head = null;
	                }

	                else if (curr == head) {
	                    TicketNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                }
	              
	                else {
	                    prev.next = curr.next;
	                }

	                System.out.println("Ticket removed successfully");
	                return;
	            }

	            prev = curr;
	            curr = curr.next;

	        } while (curr != head);

	        System.out.println("Ticket not found");
	    }
	    public void displayTickets() {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        TicketNode temp = head;
	        System.out.println("Booked Tickets:");
	        do {
	            displayTicket(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }
	    public void searchTicket(String keyword) {
	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        TicketNode temp = head;
	        boolean found = false;

	        do {
	            if (temp.customerName.equalsIgnoreCase(keyword) ||
	                temp.movieName.equalsIgnoreCase(keyword)) {
	                displayTicket(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found)
	            System.out.println("No matching ticket found");
	    }
	    public int countTickets() {
	        if (head == null)
	            return 0;

	        int count = 0;
	        TicketNode temp = head;
	        do {
	            count++;
	            temp = temp.next;
	        } while (temp != head);

	        return count;
	    }

	    private void displayTicket(TicketNode t) {
	       
	        System.out.println("Ticket ID    : " + t.ticketId);
	        System.out.println("Customer     : " + t.customerName);
	        System.out.println("Movie        : " + t.movieName);
	        System.out.println("Seat Number  : " + t.seatNumber);
	        System.out.println("Booking Time : " + t.bookingTime);
	    }
	}



