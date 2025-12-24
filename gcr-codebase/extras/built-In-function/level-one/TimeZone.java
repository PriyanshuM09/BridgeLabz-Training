//1. Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
  import java.time.ZonedDateTime;
  import java.time.ZoneId;
  import java.time.format.DateTimeFormatter;
  public class TimeZone{
  public static void main(String[]args){
  DateTimeFormatter formatter= 
  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
  
  ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
  ZonedDateTime isTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
  ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
  
          System.out.println("GMT : " + gmtTime.format(formatter));
        System.out.println("IST : " + isTime.format(formatter));
        System.out.println("PST : " + pstTime.format(formatter));
		}
		}