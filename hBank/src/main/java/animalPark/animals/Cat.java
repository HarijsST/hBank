package animalPark.animals;

import animalPark.Animal;
import animalPark.AnimalInterface;
import animalPark.Feline;

public class Cat extends Feline implements AnimalInterface {
    @Override
    public void makeNoise() {
        System.out.println("Mjaaaau...");
    }
}
