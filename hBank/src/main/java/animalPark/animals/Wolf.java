package animalPark.animals;

import animalPark.Animal;
import animalPark.AnimalInterface;

public class Wolf extends Animal implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuuu...");
    }
}
