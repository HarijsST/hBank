package animalPark.repository;

import animalPark.models.animals.*;
import animalPark.models.parents.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalRepository {
    //Comment: CRUD - Create, Read, Update, Delete

    //CTRL + ALT + O - sakārto importus
    //CTRL + ALT + L - sakārto kodu

    // Trīs konstruktora noteikumi
    // 1. Nosaukums sakrīt ar klases nosaukumu
    // 2. Nav atgriešanas tips (Animal, void, String utt)
    // 3. Izsaucot to, mēs izmantojam "new" atslēgas vārdu

    private final List<Animal> animalList = new ArrayList<>();

    public AnimalRepository(List<Animal> animalList) {
        this.animalList.addAll(animalList);
    }

    public AnimalRepository() {
        animalList.add(new Cat(1001,"Muris"));
        animalList.add(new Cow(1002, "Gauja"));
        animalList.add(new Dog(1003, "Duksis"));
        animalList.add(new Lion(1004, "Karalis"));
        animalList.add(new Wolf(1005, "Vova"));
        animalList.add(new Hamster(1006, "Tomijs"));
    }

    //READ
    public List<Animal> getAnimalList() {
        return animalList;
    }

    //DELETE
    public Animal deleteAnimalByIndex(int index) {
        return animalList.remove(index);
    }

    //DELETE
    //TODO Jāuzraksta testi - gan pozītīvai, gan negatīvais
    public boolean deleteAnimalByObject(Animal animal) {
        return animalList.remove(animal);
    }

    //DELETE
    public String deleteAllAnimals() {
        animalList.clear();
        return "All animals deleted";
    }

    //CREATE
    public Animal addAnimal(Animal animal) {
        boolean hasBeenAdded = animalList.add(animal);
        if (hasBeenAdded) {
            return animal;
        } else {
            return null;
        }
    }

    //READ
    public Animal getFirstAnimalFromList() {
        return animalList.get(0);
    }

    //READ
    public Animal getLastAnimalFromList() {
        return animalList.get(animalList.size() - 1);
    }

    //READ
    public List<Animal> getThreeAnimals() {
        List<Animal> animals = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 3; i++) {
            int caseInteger = randomGenerator.nextInt(3) + 1;
            switch (caseInteger) {
                case 1 -> animals.add(new Cow("Gauja"));
                case 2 -> animals.add(new Dog("Duksis"));
                case 3 -> animals.add(new Cat("Muris"));
            }
        }
        return animals;
    }

    //TODO Uztaisi testu šim
    public Animal updateAnimalName(int id, String newName) {
        int foundObjectIndex = -1;
        for (int i = 0; i < animalList.size(); i++) {
            if (id == animalList.get(i).getId()) {
                foundObjectIndex = i;
            }
        }
        if (foundObjectIndex != -1) {
            Animal foundAnimal = animalList.get(foundObjectIndex);
            foundAnimal.setName(newName);
            return foundAnimal;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        AnimalRepository animalRepository = new AnimalRepository();
        Cat tuksis = new Cat(1111, "Tuksis");
        animalRepository.addAnimal(tuksis);

        animalRepository.updateAnimalName(1111, "Duksis");

        Animal varbutDuksis = animalRepository.getLastAnimalFromList();
        System.out.println(varbutDuksis);
    }
}
