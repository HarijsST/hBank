package animalPark.models.animals;

import animalPark.models.parents.Animal;
import animalPark.Noisy;

public final class Cow extends Animal implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Muuuu");
    }

    public void giveMilk(){
        System.out.println("Giving milk");
    }

    @Override
    public void eat(){
        System.out.println("Eating green grass!");
    }

    @Override
    public String toString() {
        return "Cow";
    }

    @Override
    public void see() {
        System.out.println("Cow sees eveything!");
    }
}
