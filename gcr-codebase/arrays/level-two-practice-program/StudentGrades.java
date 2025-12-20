//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of students");
      int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
       double[] maths = new double[n];
        double[] percentage = new double[n];
       char[] grade = new char[n];

      // Taking input
for (int i = 0; i < n; i++) {
          System.out.println("Enter marks for Student " + (i + 1));

     System.out.println("Physics ");
       physics[i] = sc.nextDouble();
 if (physics[i] < 0) {
                i--;
               continue;
          }
       System.out.println("Chemistry ");
           chemistry[i] = sc.nextDouble();
           if (chemistry[i] < 0) {
                i--;
                  continue;
            }
      System.out.println("Maths ");
        maths[i] = sc.nextDouble();
      if (maths[i] < 0) {
                i--;
        continue;
            }
         
percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
 
      if (percentage[i] >= 80)
                grade[i] = 'A';
       else if (percentage[i] >= 70)
                grade[i] = 'B';
         else if (percentage[i] >= 60)
                grade[i] = 'C';
      else if (percentage[i] >= 50)
             grade[i] = 'D';
       else
            grade[i] = 'F';
        }

       
        System.out.println(" Student Result ");
for (int i = 0; i < n; i++) {
           System.out.println("Student " + (i + 1));
           System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
          
        }
    }
}