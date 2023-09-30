package animalPark;

public class Cow extends Animal implements AnimalInterface{
    @Override
    public void makeNoise() {
        System.out.println("Muuuu");
    }
}
