package animalPark.models.parents;

public abstract class Canine extends Animal {
    public void roam(){
        System.out.println("Klīst apkārt");
    }

    protected Canine(String name){
        super(name);
    }

    protected Canine(int id, String name){
        super(id, name);
    }
}
