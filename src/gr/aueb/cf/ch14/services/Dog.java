package gr.aueb.cf.ch14.services;

import gr.aueb.cf.ch14.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(){

    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("makes a woof sound");
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("dog eats the food");
    }

    //public api

}
