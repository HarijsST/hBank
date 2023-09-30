package animalPark.animals;

import animalPark.AnimalInterface;
import animalPark.Canine;

public class Wolf extends Canine implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuuu...");
    }
}
