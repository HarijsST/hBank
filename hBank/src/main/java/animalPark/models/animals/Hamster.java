package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Animal;

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
