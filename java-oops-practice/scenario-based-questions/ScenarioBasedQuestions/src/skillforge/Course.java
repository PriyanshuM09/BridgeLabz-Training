package skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private String[] reviews;   

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Project"};
        this.reviews = new String[]{"Good", "Excellent"};
        this.rating = calculateRating();
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Nice", "Very Helpful"};
        this.rating = calculateRating();
    }

    // Protected rating logic
    protected double calculateRating() {
        return reviews.length * 2.5;  
    }

    public String[] getReviews() {
        return reviews;
    }

    public String getTitle() {
        return title;
    }
}

