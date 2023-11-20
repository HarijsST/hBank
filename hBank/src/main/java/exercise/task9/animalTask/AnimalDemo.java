package exercise.task9.animalTask;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.voice();
        animal.sleep();

        Animal animal2 = new Dog();
        animal2.voice();
        animal2.sleep();
    }
}
