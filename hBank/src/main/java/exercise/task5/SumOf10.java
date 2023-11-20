package exercise.task5;

public class SumOf10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);
        System.out.println("Total sum of numbers from 0 - 10 is " + sum);
    }
}
