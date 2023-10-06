package animalPark;

import animalPark.animals.Cat;
import animalPark.animals.Dog;
import animalPark.animals.Lion;
import animalPark.animals.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        List <Cow> randoms = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            randoms.add(new Cow());
        }

        for (Cow element : randoms) {
            element.eat();
            System.out.println(element + " ");
        }
    }
}
