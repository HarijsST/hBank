package animalPark;

import animalPark.models.animals.*;
import animalPark.models.parents.Animal;
import animalPark.models.parents.Canine;
import animalPark.models.parents.Feline;
import animalPark.repository.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

public class KingdomApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.move();

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.move();

        Lion lion = new Lion();
        lion.makeNoise();
        lion.sleep();

        Cow cow = new Cow();
        cow.eat();
        cow.makeNoise();

        Feline muris = new Cat();
        muris.roam();

        Canine suns = new Dog();
        suns.roam();

        List<Cow> cowsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cowsList.add(new Cow());
        }

        for (Cow cowForForLoop : cowsList) {
            cowForForLoop.eat();
            System.out.println(cowForForLoop + " ");
        }

        AnimalRepository repository = new AnimalRepository();

        System.out.println("AnimalInterface");
        List<Animal> animals = repository.getThreeAnimals();
        for (Animal animal : animals) {
            animal.eat();
            animal.see();
        }
        System.out.println(repository.getThreeAnimals());
        System.out.println(repository.getAnimalList());
        System.out.println(repository.getFirstAnimalFromList());
        System.out.println(repository.getLastAnimalFromList());

        muris.scratch();
        lion.scratch();
        Hamster hamster = new Hamster();
        hamster.makeNoise();
        new Cat();
    }
}
