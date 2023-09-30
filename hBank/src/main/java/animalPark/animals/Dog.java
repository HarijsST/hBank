package animalPark.animals;

import animalPark.Animal;
import animalPark.AnimalInterface;

public class Dog extends Animal implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("VAU VAU...");
    }
}
