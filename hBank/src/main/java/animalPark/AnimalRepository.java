package animalPark;

import animalPark.zoo.animals.*;
import animalPark.zoo.parents.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalRepository {

    //Comment: CRUD - Create, Read, Update, Delete
    private List<Animal> animalList = new ArrayList<>();

    //This is the constructor ->
    public AnimalRepository() {
        animalList.add(new Cat());
        animalList.add(new Cow());
        animalList.add(new Dog());
        animalList.add(new Lion());
        animalList.add(new Wolf());
        //Add objects of new clases to the animalList - directly here
    }

    //1. Create 1 method that return all animals - animalList + add test :)

    //2. Create 1 method that returns first animal (with index 0) from animalList + add test

    //3. Create 1 method that returns last animal (with last index) from animalList + add test

    //4. Add some more animal classes ( Hamster? Giraffe ? ) and then add to AnimalRepo constructor

    //(Optional) 5. Create a new interface Scratchy (Skrāpēšana) and add it to FEW classes

    public List<Animal> getThreeAnimals() {
        // is-a  Cat is Animal
        // is-a  Dog is Animal
        List<Animal> animals = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 3; i++) {
            int caseInteger = randomGenerator.nextInt(3) + 1;
            switch (caseInteger) {
                case 1 -> animals.add(new Cow());
                case 2 -> animals.add(new Dog());
                case 3 -> animals.add(new Cat());
            }
        }
        return animals;
    }
}
