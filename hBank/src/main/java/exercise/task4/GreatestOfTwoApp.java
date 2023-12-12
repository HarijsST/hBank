package exercise.task4;

public class GreatestOfTwoApp {
    public static void main(String[] args) {
        GreatestOfTwo greatestOfTwo = new GreatestOfTwo();
        System.out.println(greatestOfTwo.getGreatest(1, 2));
        System.out.println(greatestOfTwo.getGreatest(3, 4));
        System.out.println(greatestOfTwo.getGreatest(3, 3));
    }
}
