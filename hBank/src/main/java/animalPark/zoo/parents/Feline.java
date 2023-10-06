package animalPark.zoo.parents;

import animalPark.zoo.parents.Animal;

public abstract class Feline extends Animal {
    public void roam(){
        System.out.println("Klīst apkārt");
    }

    @Override
    public final void see(){
        System.out.println("Feline sees eveything!");
    }
}
