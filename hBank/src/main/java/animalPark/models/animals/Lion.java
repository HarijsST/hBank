package animalPark.models.animals;

import animalPark.Noisy;

import animalPark.Scratchy;
import animalPark.models.parents.Feline;

public final class Lion extends Feline implements Noisy, Scratchy {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr...");
    }

    @Override
    public void scratch() {
        System.out.println("Lions scratch trees");
    }

    public Lion(String name){
        super(name);
    }

    public Lion(int id, String name){
        super(id, name);
    }
}
