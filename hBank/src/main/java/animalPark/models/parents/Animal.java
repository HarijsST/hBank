package animalPark.models.parents;

import java.util.Random;

public abstract class Animal {

    private final static Random randomGenerator = new Random();

    private int id;
    protected String name;

    public static String getZooAdress() {
        return "Ķīšezera 51A";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    protected Animal(String name) {
        this.id = randomGenerator.nextInt(9000) + 1000; // Diapazons no 1000 līdz 9999
        this.name = name;
    }

    protected Animal(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public final String toString() {
        return getClass().getSimpleName() + "{" +
                "id='" + id + "\', " +
                "name='" + name + '\'' +
                '}';
    }
}
