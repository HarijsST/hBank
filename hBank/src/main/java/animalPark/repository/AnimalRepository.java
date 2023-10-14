package animalPark.repository;

import animalPark.models.animals.*;
import animalPark.models.parents.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalRepository {

    //Comment: CRUD - Create, Read, Update, Delete

    // Trīs konstruktora noteikumi
    // 1. Nosaukums sakrīt ar klases nosaukumu
    // 2. Nav atgriešanas tips (Animal, void, String utt)
    // 3. Izsaucot to, mēs izmantojam "new" atslēgas vārdu

    public final List<Animal> animalList = new ArrayList<>();
    public AnimalRepository(){
        animalList.add(new Cat());
        animalList.add(new Cow());
        animalList.add(new Dog());
        animalList.add(new Lion());
        animalList.add(new Wolf());
        animalList.add(new Hamster());
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public Animal getFirstAnimalFromList(){
        return animalList.get(0);
    }

    public Animal getLastAnimalFromList(){
        return animalList.get(animalList.size() - 1);
    }

    public List<Animal> getThreeAnimals() {
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

    //1. Izveidot visiem dzīvniekiem vārdu (jauns lauks - name)
    //1.1 Nomaini toString, lai arī tur tiktu parādīts lauks name - līdzīgi kā StaticAdressExample

    //2. Uzdevums - Izveidot jaunu konstruktoru, kas kā argumentu pieņemtu sarakstu List<Animal>
    // un šis konstruktors uzstādīs padoto sarakstu, lai tas būtu dzīvnieku saraksts.

    //3. Uzdevums - testi


}
