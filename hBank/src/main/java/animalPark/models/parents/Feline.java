package animalPark.models.parents;

import animalPark.Scratchy;

public abstract class Feline extends Animal implements Scratchy{
    public void roam(){
        System.out.println("Klīst apkārt");
    }

    @Override
    public final void see(){
        System.out.println("Feline sees eveything!");
    }

    protected Feline(String name){
        super(name);
    }

    protected Feline(int id, String name){
        super(id, name);
    }
}
