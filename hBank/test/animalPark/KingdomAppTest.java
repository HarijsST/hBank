package animalPark;

import animalPark.models.animals.Cat;
import animalPark.models.animals.Dog;
import animalPark.models.animals.Lion;
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
    @Test
    public void testKingdomApp_deleteAllAnimals(){
        // setup
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        animalList.add(new Dog("Duksis"));
        animalList.add(new Lion("Karalis"));
        AnimalRepository victim = new AnimalRepository(animalList);
        // action
        final String al = victim.deleteAllAnimals();
        // assertions
        assertEquals(al, "All animals deleted");
        List<Animal> resultingAnimalList = victim.getAnimalList();
        assertEquals(resultingAnimalList.isEmpty(), true);
    }
    @Test
    public void testKingdomApp_deleteAnimalsByIndex(){
        //setup
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        animalList.add(new Dog( 1111, "Duksis"));
        animalList.add(new Lion("Karalis"));
        AnimalRepository victim = new AnimalRepository(animalList);
        //action
        Animal removedAnimal = victim.deleteAnimalByIndex(1);
        // assertion
        assertEquals(removedAnimal.getId(), 1111);
        assertEquals(removedAnimal.getName(), "Duksis");
        // CTRL + ALT + V
        List<Animal> returnedAnimalList = victim.getAnimalList();
        assertEquals(returnedAnimalList.size(), 2);
    }

    @Test
    public void testKingdomApp_deleteAnimalsByIndex_NotExistingIndex(){
        //Setup
        AnimalRepository animalRepository = new AnimalRepository();
        try{
            //Action
            animalRepository.deleteAnimalByIndex(999);
            throw new AssertionError("Should have failed in delete!");
        }
        catch (IndexOutOfBoundsException e){
            //Assertions
            System.out.println("Got the exception we wanted");
        }
    }

    @Test
    public void testKingdomApp_addAnimal() {
        // setup
        List<Animal> animalList = new ArrayList<>();
        assertEquals(animalList.isEmpty(), true);
        AnimalRepository victim = new AnimalRepository(animalList);
        // action
        Animal addAnimal = victim.addAnimal(new Cat("Mimī"));
        assertEquals(addAnimal.getName(), "Mimī");
        List<Animal> resultingAnimalList = victim.getAnimalList();
        assertEquals(resultingAnimalList.isEmpty(), false);
    }
}