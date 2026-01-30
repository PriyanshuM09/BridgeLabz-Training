package com.lambdaexpression.nameuppercasting;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NameUpperCase {
	

	    public static void main(String[] args) {
	        List<String> employees=Arrays.asList("Suyash", "Amit", "Ravi", "Neha");
	        List<String> upperCaseNames=employees.stream().map(String::toUpperCase).collect(Collectors.toList());

	        upperCaseNames.forEach(System.out::println);
	    }
	}


