package animalPark.animals;

import animalPark.Animal;
import animalPark.AnimalInterface;

public class Lion extends Animal implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr...");
    }
}
