package animalPark.animals;

import animalPark.AnimalInterface;
import animalPark.Canine;

public class Dog extends Canine implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("VAU VAU...");
    }
}
