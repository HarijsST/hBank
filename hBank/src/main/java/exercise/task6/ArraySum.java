package exercise.task6;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 9, 11, 20};
        int counter = 0;
        for (int number : numbers) {
            counter = counter + number;
        }
        System.out.println(counter);
    }
}
