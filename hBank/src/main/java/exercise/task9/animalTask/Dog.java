package exercise.task9.animalTask;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Dog says: VAU VAU VAU");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleep");
    }
}
