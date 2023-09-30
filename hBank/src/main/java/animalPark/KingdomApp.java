package animalPark;

import animalPark.animals.Cat;
import animalPark.animals.Dog;
import animalPark.animals.Lion;
import animalPark.animals.Wolf;

public class KingdomApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.move();

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.move();

        Lion lion = new Lion();
        lion.makeNoise();
        lion.sleep();

        Cow cow = new Cow();
        cow.eat();
        cow.makeNoise();

        Feline muris = new Cat();
        muris.roam();

        Canine suns = new Dog();
        suns.roam();
    }
}
