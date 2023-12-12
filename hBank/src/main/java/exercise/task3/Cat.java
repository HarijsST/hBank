package exercise.task3;

public class Cat {
    private String name;
    private String color;
    private String species;
    private int age;
    private int weight;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Cat's name: " + getName());
        System.out.println("Cat's color: " + getColor());
        System.out.println("Cat's species: " + getSpecies());
        System.out.println("Cat's age: " + getAge());
        System.out.println("Cat's weight: " + getWeight());
    }
}
