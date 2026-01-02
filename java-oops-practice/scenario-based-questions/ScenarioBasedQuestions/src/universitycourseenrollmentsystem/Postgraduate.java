package universitycourseenrollmentsystem;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 50) {
            setGpa(4.0);
        } else {
            setGpa(0.0);
        }
    }
}
