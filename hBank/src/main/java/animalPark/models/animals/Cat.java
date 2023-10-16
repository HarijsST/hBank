package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Feline;

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
    public void scratch() {
        System.out.println("Cats scratch wallpaper");
    }

    public Cat(String name){
        super(name);
    }
}
