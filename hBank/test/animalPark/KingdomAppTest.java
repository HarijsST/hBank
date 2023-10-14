package animalPark;

import animalPark.models.parents.Animal;
import animalPark.repository.AnimalRepository;
import org.junit.Test;

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

        //TODO Turpini pats. Kkās asserts būs
    }

    @Test
    public void testKindomApp_getLastAnimalFromList(){
        //TODO Turpini pats
    }

    //TODO testKindomApp_getAnimalList

    //TODO testKindomApp_withTheNewConstructor
    // new AnimalRepository(animalList)
    // pārbaudīsi tests līdzīgs kā šis tests - testKindomApp_getAnimalList
}