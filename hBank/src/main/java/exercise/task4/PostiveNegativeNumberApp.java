package exercise.task4;

public class PostiveNegativeNumberApp {
    public static void main(String[] args) {
        PostiveNegativeNumber postiveNegativeNumber = new PostiveNegativeNumber();
        System.out.println(postiveNegativeNumber.isPositive(-1));
        System.out.println(postiveNegativeNumber.isPositive(-5));
        System.out.println(postiveNegativeNumber.isPositive(0));
        System.out.println(postiveNegativeNumber.isPositive(3));
        System.out.println(postiveNegativeNumber.isPositive(13));
        System.out.println();
        System.out.println(postiveNegativeNumber.isNegative(-1));
        System.out.println(postiveNegativeNumber.isNegative(-5));
        System.out.println(postiveNegativeNumber.isNegative(0));
        System.out.println(postiveNegativeNumber.isNegative(3));
        System.out.println(postiveNegativeNumber.isNegative(13));
    }
}
