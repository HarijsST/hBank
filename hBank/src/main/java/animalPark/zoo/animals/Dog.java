package animalPark.zoo.animals;

import animalPark.Noisy;
import animalPark.zoo.parents.Canine;

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
}
