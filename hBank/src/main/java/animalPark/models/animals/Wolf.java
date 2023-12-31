package animalPark.models.animals;

import animalPark.Noisy;
import animalPark.models.parents.Canine;

public final class Wolf extends Canine implements Noisy {
    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuuu...");
    }

    @Override
    public void see() {
        System.out.println("Wolf sees everything!");
    }

    public Wolf(String name){
        super(name);
    }

    public Wolf(int id, String name){
        super(id, name);
    }
}
