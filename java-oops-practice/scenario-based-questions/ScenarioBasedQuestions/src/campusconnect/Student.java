package campusconnect;

class Student extends Person implements ICourseActions {
    private int[] grades;   // private as required

    Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    // Polymorphism
    @Override
    void printDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name +
                ", GPA: " + calculateGPA());
    }
}
