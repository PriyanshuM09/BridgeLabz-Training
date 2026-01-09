package skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public String toString() {
        return "Beginner Level Certificate Format";
    }
}
