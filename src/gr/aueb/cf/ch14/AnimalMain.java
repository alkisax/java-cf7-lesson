package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.services.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("tommy", 5, "golden retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);
    }
    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
