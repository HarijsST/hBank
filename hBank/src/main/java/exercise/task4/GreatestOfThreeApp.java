package exercise.task4;

public class GreatestOfThreeApp {
    public static void main(String[] args) {
        GreatestOfThree greatestOfThree = new GreatestOfThree();

        System.out.println(greatestOfThree.getGreatest(1, 2, 3));
        System.out.println(greatestOfThree.getGreatest(3, 4, 2));
        System.out.println(greatestOfThree.getGreatest(3, 2, 1));
        System.out.println(greatestOfThree.getGreatest(3, 3, 3));
    }
}
