package exercise.task3;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Mincis");
        cat.setColor("Rižiks");
        cat.setSpecies("Kaķis parastais");
        cat.setAge(6);
        cat.setWeight(4);
        Cat cat2 = new Cat("Mimī");
        cat2.setColor("Melnbalts");
        cat2.setSpecies("Norvēģijas meža kaķis");
        cat2.setAge(2);
        cat2.setWeight(5);
        Cat cat3 = new Cat("Muris", "pelēks", 5);
        cat3.setSpecies("Persietis");
        cat3.setWeight(7);
        cat.printInfo();
        cat2.printInfo();
        cat3.printInfo();
    }
}
