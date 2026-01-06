package campusconnect;

public class CampusConnect {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@college.edu");

        int[] grades = {8, 9, 7};
        Student s1 = new Student(1, "Priyanshu", "priyanshu@college.edu", grades);

        Course javaCourse = new Course("Java Programming", f1);

        s1.enrollCourse(javaCourse);

        System.out.println();
        s1.printDetails();   
        f1.printDetails();  

        System.out.println();
        javaCourse.displayCourseDetails();
    }
}
