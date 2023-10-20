package animalPark;

import animalPark.models.animals.Cat;
import animalPark.models.animals.Dog;
import animalPark.models.animals.Lion;
import animalPark.models.animals.Wolf;
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
    @Test
    public void testKingdomApp_deleteAllAnimals(){
        List<Animal> animalList = new ArrayList<>();
        AnimalRepository victim = new AnimalRepository(animalList);
        final String al = victim.deleteAllAnimals();
        assertEquals(al, "All animals deleted");
        System.out.println("All animals deleted");
        assertEquals(animalList.isEmpty(), true);
        List<Animal> tt = victim.getAnimalList();
        assertEquals(tt.isEmpty(), true);
    }
    @Test
    public void testKingdomApp_deleteAnimalsByIndex(){
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        animalList.add(new Dog("Duksis"));
        animalList.add(new Lion("Karalis"));
        AnimalRepository victim = new AnimalRepository(animalList);
        Animal removedAnimalIndex = victim.deleteAnimalByIndex(1);
        assertEquals(removedAnimalIndex, 1);
    }
    @Test
    public void testKingdomApp_hasBeenAdded() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Muris"));
        animalList.add(new Wolf("Vova"));
        animalList.add(new Lion("Karalis"));
        assertEquals(animalList.size(), 3);
    }
}