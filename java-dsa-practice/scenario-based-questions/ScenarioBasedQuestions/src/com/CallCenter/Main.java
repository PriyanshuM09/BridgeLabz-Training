package com.CallCenter;

public class Main {
	    public static void main(String[] args) {

	        CallCenterService service = new CallCenterService();
	        service.addCall("Rahul", false);
	        service.addCall("Ananya", true);
	        service.addCall("Rahul", false);
	        service.addCall("Vikram", true);
	        service.addCall("Neha", false);

	        System.out.println();

	        service.serveCall();
	        service.serveCall();
	        service.serveCall();

	        service.showCallHistory();
	    }
	}


