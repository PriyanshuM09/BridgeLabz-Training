package edumentor;

class Learner extends User implements ICertifiable {

public boolean isFullTimeCourse;

public Learner(String name, String email,int userId,boolean isFullTimeCourse) {
	
	super(name,email,userId);
	
	this.isFullTimeCourse=isFullTimeCourse;
	
}
public void generateCertificate() {
    if (isFullTimeCourse) {
        System.out.println("Full-Time Course Certificate generated for " + name);
    } else {
        System.out.println("Short Course Certificate generated for " + name);
    }
    }
}



