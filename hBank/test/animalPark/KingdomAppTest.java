package animalPark;

import animalPark.models.animals.Cat;
import animalPark.models.parents.Animal;
import animalPark.repository.AnimalRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class KingdomAppTest {

    @Test
    public void testKindomApp_getThreeAnimals(){
        AnimalRepository victim = new AnimalRepository();

        final List<Animal> threeAnimals = victim.getThreeAnimals();

        assertEquals(threeAnimals.size(), 3);
        System.out.println("Test finished!");
    }

    @Test
    public void testKindomApp_getFirstAnimalFromList(){
        AnimalRepository victim = new AnimalRepository();

        final Animal animal = victim.getFirstAnimalFromList();
        assertEquals(animal.getName(), "Muris");
    }

    @Test
    public void testKindomApp_getLastAnimalFromList(){
        AnimalRepository victim = new AnimalRepository();
        final  Animal animal = victim.getLastAnimalFromList();
        assertEquals(animal.getName(), "Tomijs");
    }

    //TODO testKindomApp_getAnimalList
    @Test
    public void testKindomApp_getAnimalList(){
        AnimalRepository victim = new AnimalRepository();

        final List<Animal> allAnimal = victim.getAnimalList();

        assertEquals(allAnimal.size(), 6);
        assertEquals(allAnimal.get(0).getName(), "Muris");
        assertEquals(allAnimal.get(1).getName(), "Gauja");
        assertEquals(allAnimal.get(2).getName(), "Duksis");
        assertEquals(allAnimal.get(3).getName(), "Karalis");
        assertEquals(allAnimal.get(4).getName(), "Vova");
        assertEquals(allAnimal.get(5).getName(), "Tomijs");

        System.out.println("Test finished!");
    }
    @Test
    public void testKingdomApp_withTheNewConstructor(){
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        AnimalRepository victim = new AnimalRepository(animalList);
        final List<Animal> allAnimal = victim.getAnimalList();
        assertEquals(allAnimal.size(), 1);
        assertEquals(allAnimal.get(0).getName(), "Muris");
    }
}