package skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public String toString() {
        return "Advanced Level Certificate Format";
    }
}

