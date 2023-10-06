package animalPark.zoo.animals;

import animalPark.Noisy;
import animalPark.zoo.parents.Canine;

public final class Wolf extends Canine implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuuu...");
    }

    @Override
    public void see() {
        System.out.println("Wolf sees everything!");
    }

    @Override
    public String toString() {
        return "Wolf";
    }
}
