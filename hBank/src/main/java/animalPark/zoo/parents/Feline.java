package animalPark.zoo.parents;

import animalPark.Scratchy;
import animalPark.zoo.parents.Animal;

public abstract class Feline extends Animal implements Scratchy{
    public void roam(){
        System.out.println("Klīst apkārt");
    }

    @Override
    public final void see(){
        System.out.println("Feline sees eveything!");
    }
}
