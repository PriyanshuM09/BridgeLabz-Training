import java.util.Scanner;

public class SchoolBusAttendance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    String[] students ={ "Aman", "Riya", "Rahul", "Sneha", "Priyanshu","Neha", "Karan", "Anjali", "Rohit", "Pooja" };

        int presentCount = 0;
        int absentCount = 0;

     // for-each loop to check attendance
        for(String name : students){

      System.out.print("Is " + name + " Present or Absent? (P/A): ");
     char status = sc.next().charAt(0);

         if(status == 'P' || status == 'p'){
			presentCount++;
            } 
		else{
              absentCount++;
            }
        }
        System.out.println("\nTotal Present Students: " + presentCount);
        System.out.println("Total Absent Students: " + absentCount);
    }
}
