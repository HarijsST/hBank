package animalPark.zoo.animals;

import animalPark.Noisy;

import animalPark.Scratchy;
import animalPark.zoo.parents.Feline;

public final class Lion extends Feline implements Noisy, Scratchy {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr...");
    }

    @Override
    public String toString() {
        return "Lion";
    }

    @Override
    public void scratch() {
        System.out.println("Lions scratch trees");
    }
}
