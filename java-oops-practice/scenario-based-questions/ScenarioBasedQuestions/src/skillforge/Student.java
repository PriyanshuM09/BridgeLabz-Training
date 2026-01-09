package skillforge;

public class Student extends User implements ICertifiable {

    private int progress;  

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(int value) {
        progress += value;  
        if (progress > 100) progress = 100;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100) {
            System.out.println("Certificate Generated for: " + name);
        } else {
            System.out.println("Complete the course to get certificate.");
        }
    }
}
