package universitycourseenrollmentsystem;

public class UniversitySystem{
    public static void main(String[] args){

        Student s1 = new Undergraduate(101, "Priyanshu");
        Student s2 = new Postgraduate(102, "Amit");

        Course c1 = new Course("CS101", "Object Oriented Programming");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        Faculty faculty = new Faculty("Dr. Sharma");

        faculty.assignGrade((Graded) s1, 82);
        faculty.assignGrade((Graded) s2, 55);

        e1.showEnrollment();
        s1.viewTranscript();

        System.out.println();

        e2.showEnrollment();
        s2.viewTranscript();
    }
}

