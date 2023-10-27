package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Animal;

public class Hamster extends Animal implements Noisy {
    @Override
    public void see() {
        System.out.println("Hamster something see...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Hamster make some noise");
    }

    public Hamster(String name){
        super(name);
    }

    public Hamster(int id, String name){
        super(id, name);
    }
}
