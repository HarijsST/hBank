package animalPark.animals;

import animalPark.AnimalInterface;

import animalPark.Feline;

public class Lion extends Feline implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr...");
    }
}
