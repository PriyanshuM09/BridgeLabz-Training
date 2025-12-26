import java.util.Scanner;

public class ResultGenerator{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int[] marks = new int[5];
     int total = 0;

   for(int i=0;i<5;i++){
    System.out.print("Enter marks of subject " +(i + 1)+ ": ");
     marks[i] = sc.nextInt();
      total += marks[i];
        }
   double average = total / 5.0;
   System.out.println("Average Marks: " + average);
     int gradeKey;
   if(average>= 90)
     gradeKey = 1;
    else if(average>=75)
      gradeKey = 2;
     else if(average>= 60)
      gradeKey = 3;
     else if(average>=40)
      gradeKey = 4;
     else
       gradeKey = 5;

     switch(gradeKey){
       case 1:
          System.out.println("Grade: A");
             break;
        case 2:
           System.out.println("Grade: B");
                break;
          case 3:
           System.out.println("Grade: C");
                break;
         case 4:
           System.out.println("Grade: D");
                break;
          default:
            System.out.println("Grade: F");
        }
    }
}
