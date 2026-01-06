package petpal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet pet1 = new Dog("Buddy", 3);
        Pet pet2 = new Cat("Kitty", 2);
        Pet pet3 = new Bird("Tweety", 1);

        Pet[] pets = { pet1, pet2, pet3 };

        for (Pet pet : pets) {
            pet.makeSound();   
            pet.feed();
            pet.play();
            pet.sleep();
            System.out.println("Mood Level: " + pet.getMood());
            System.out.println("--------------------");
        }
    }
}
