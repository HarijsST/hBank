package exercise.task4;

public class EvenOddNumberApp {
    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        System.out.println(evenOddNumber.getNumberType(1));
        System.out.println(evenOddNumber.getNumberType(0));
        System.out.println(evenOddNumber.getNumberType(10));
        System.out.println(evenOddNumber.getNumberType(13));
        System.out.println(evenOddNumber.getNumberType(4));
    }
}
