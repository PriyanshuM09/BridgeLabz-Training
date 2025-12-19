//Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // 2D array to store marks [students][subjects]
        int[][] marks = new int[students][3];

        // Input marks
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0;
            String grade;

            if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "Fail";
            }

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Total = " + total);
            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
        }
    }
}
