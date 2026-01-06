package petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   
    private int mood;     
    protected int energy;

    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(40) + 30;
        this.mood = rand.nextInt(40) + 30;
        this.energy = rand.nextInt(40) + 30;
    }

    public int getHunger() {
        return hunger;
    }

    public int getMood() {
        return mood;
    }

    protected void changeHunger(int value) {
        hunger += value;
    }

    protected void changeMood(int value) {
        mood += value;
    }

    public abstract void makeSound();
}
