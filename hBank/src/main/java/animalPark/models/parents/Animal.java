package animalPark.models.parents;

public abstract class Animal {

    public static String getZooAdress() {
        return "Ķīšezera 51A";
    }

    public abstract void see();

    public void eat() {
        System.out.println("Ņam ņam ņam...");
    }

    public void sleep() {
        System.out.println("Guļ");
    }

    public void move() {
        System.out.println("Skrien...");
    }
}
