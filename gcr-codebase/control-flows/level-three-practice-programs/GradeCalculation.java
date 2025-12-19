// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking marks as input
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // Calculating total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        char grade;
        String remarks;

        // Determining grade and remarks
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Displaying output
        System.out.println("\n----- Result -----");
        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        
    }
} 
