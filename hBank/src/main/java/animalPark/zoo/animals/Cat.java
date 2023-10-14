package animalPark.zoo.animals;

import animalPark.Noisy;
import animalPark.Scratchy;
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

    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public void scratch() {
        System.out.println("Cats scratch wallpaper");
    }
}
