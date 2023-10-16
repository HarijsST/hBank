package animalPark;

import animalPark.models.animals.Cat;
import animalPark.models.parents.Animal;
import animalPark.repository.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

public class KingdomApp {
    public static void main(String[] args) {
        AnimalRepository repository = new AnimalRepository();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        AnimalRepository repositor2 = new AnimalRepository(animalList);
        System.out.println(repositor2.getAnimalList());
    }
}
