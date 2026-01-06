package petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        changeHunger(-5);
        System.out.println(name + " is pecking seeds.");
    }

    public void play() {
        changeMood(+12);
        energy -= 8;
        System.out.println(name + " is flying.");
    }

    public void sleep() {
        energy += 15;
        System.out.println(name + " is resting.");
    }

    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp!");
    }
}
