package animalPark.zoo.parents;

public abstract class Animal {

    public abstract void see();

    public void eat(){
        System.out.println("Ņam ņam ņam...");
    }

    public void sleep(){
        System.out.println("Guļ");
    }

    public void move(){
        System.out.println("Skrien...");
    }
}
