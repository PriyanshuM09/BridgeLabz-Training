package com.streamapi.expiringmemberships;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Main {

	    public static void main(String[] args) {

	        List<GymMember> members = Arrays.asList(
	            new GymMember("Rahul", LocalDate.now().plusDays(10)),
	            new GymMember("Anita", LocalDate.now().plusDays(40)),
	            new GymMember("Vikram", LocalDate.now().plusDays(25)),
	            new GymMember("Neha", LocalDate.now().minusDays(5)),
	            new GymMember("Suresh", LocalDate.now().plusDays(30))
	        );

	        LocalDate today=LocalDate.now();
	        LocalDate next30Days=today.plusDays(30);
	        List<GymMember> expiringSoon=members.stream()

	            .filter(m -> !m.getExpiryDate().isBefore(today) &&
	                         !m.getExpiryDate().isAfter(next30Days))

	            .collect(Collectors.toList()); 
	        expiringSoon.forEach(System.out::println);
	    }
	}


