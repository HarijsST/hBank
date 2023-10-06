package animalPark.zoo.animals;

import animalPark.Noisy;
import animalPark.zoo.parents.Feline;

public final class Cat extends Feline implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Mjaaaau...");
    }

    @Override
    public final void eat(){
        System.out.println("Eating smelly fishes");
    }
}
