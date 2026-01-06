package petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        changeHunger(-8);
        System.out.println(name + " is eating.");
    }

    public void play() {
        changeMood(+10);
        energy -= 5;
        System.out.println(name + " is playing.");
    }

    public void sleep() {
        energy += 25;
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

