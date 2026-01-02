package universitycourseenrollmentsystem;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 90) setGpa(4.0);
        else if (marks >= 75) setGpa(3.0);
        else if (marks >= 60) setGpa(2.0);
        else setGpa(0.0);
    }
}

