package animalPark.zoo.animals;

import animalPark.Noisy;

import animalPark.zoo.parents.Feline;

public final class Lion extends Feline implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr...");
    }
}
