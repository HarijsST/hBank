package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Feline;

public final class Cat extends Feline implements Noisy {
    private String name;

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
