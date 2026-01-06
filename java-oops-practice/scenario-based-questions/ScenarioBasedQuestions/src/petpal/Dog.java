package petpal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        changeHunger(-10);
        energy += 5;
        System.out.println(name + " is eating.");
    }

    public void play() {
        changeMood(+15);
        energy -= 10;
        System.out.println(name + " is playing fetch.");
    }

    public void sleep() {
        energy += 20;
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
