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
    public void see() {
        System.out.println("Cow sees eveything!");
    }

    public Cow(String name){
        super(name);
    }

    public Cow(int id, String name){
        super(id, name);
    }
}
