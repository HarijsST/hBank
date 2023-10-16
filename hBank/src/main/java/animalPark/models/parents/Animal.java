package animalPark.models.parents;

public abstract class Animal {
    protected String name;

    public static String getZooAdress() {
        return "Ķīšezera 51A";
    }

    public String getName() {
        return name;
    }

    protected Animal(String name) {
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
                "name='" + name + '\'' +
                '}';
    }
}
