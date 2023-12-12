package exercise.task6;

import done.car.Car;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils(source);
        int[] copy = arrayUtils.copy(source);

        int[] numbers = {1, 3, 5, 6};
        int[] numbers2 = numbers;

        int[] numbers3 = {1, 3, 5, 6};
        int[] numbers4 = {1, 3, 5, 6};

        System.out.println("Source: " + source);
        System.out.println("Copy: " + copy);
        System.out.println("numbers3: " + numbers3);
        System.out.println("numbers4: " + numbers4);
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(copy));
        System.out.println(copy[1]);

        int[] reversedArray = arrayUtils.reverse(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(reversedArray));
    }
}
