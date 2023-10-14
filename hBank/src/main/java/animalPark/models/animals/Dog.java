package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Canine;

public final class Dog extends Canine implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("VAU VAU...");
    }

    @Override
    public void see() {
        System.out.println("Dog sees everything!");
    }

    @Override
    public void eat(){
        System.out.println("Eating delicious bones");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
