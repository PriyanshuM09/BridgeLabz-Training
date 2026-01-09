package skillforge;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Rahul", "rahul@skillforge.com");

        Course javaCourse = new BeginnerCourse("Java Basics", inst);
        inst.uploadCourse(javaCourse);

        Student s1 = new Student("Priyanshu", "priyanshu@gmail.com");

        s1.updateProgress(50);
        s1.updateProgress(50);

        s1.generateCertificate();

        System.out.println(javaCourse.toString());
    }
}
