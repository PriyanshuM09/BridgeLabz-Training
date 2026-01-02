package universitycourseenrollmentsystem;

public class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void assignGrade(Graded student, double marks) {
        student.assignGrade(marks);
    }
}
