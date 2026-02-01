package com.streamapi.sensorreading;
import java.util.*;
import java.util.stream.*;
public class Main {


	    public static void main(String[] args) {
	        List<SensorReading> readings=Arrays.asList(
	            new SensorReading("S1", 23.5),
	            new SensorReading("S2", 45.2),
	            new SensorReading("S3", 12.8),
	            new SensorReading("S4", 67.9),
	            new SensorReading("S5", 30.0));

	        double threshold=30.0;

	        readings.stream().filter(r -> r.getValue() > threshold).forEach(r ->System.out.println("Sensor: " + r.getSensorId() +" Value: " + r.getValue() ));
	    }
	}


