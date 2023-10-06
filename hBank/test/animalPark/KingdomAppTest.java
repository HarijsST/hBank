package animalPark;

import animalPark.zoo.parents.Animal;
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
}