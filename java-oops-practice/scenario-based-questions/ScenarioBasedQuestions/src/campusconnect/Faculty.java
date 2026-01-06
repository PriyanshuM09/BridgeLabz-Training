package campusconnect;

class Faculty extends Person {

    Faculty(int id, String name, String email) {
        super(id, name, email);
    }

    // Polymorphism
    @Override
    void printDetails() {
        System.out.println("Faculty ID: " + id + ", Name: " + name +
                ", Email: " + email);
    }
}

