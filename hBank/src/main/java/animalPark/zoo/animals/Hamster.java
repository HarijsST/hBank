package animalPark.zoo.animals;

import animalPark.Noisy;
import animalPark.zoo.parents.Animal;

public class Hamster extends Animal implements Noisy {

    @Override
    public String toString() {
        return "Hamster";
    }

    @Override
    public void see() {
        System.out.println("Hamster something see...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Hamster make some noise");
    }
}
