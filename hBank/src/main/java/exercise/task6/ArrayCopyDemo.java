package exercise.task6;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils(source);
        int[] copy = arrayUtils.copy(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(copy));
        System.out.println(copy[1]);

        int[] reversedArray = arrayUtils.reverse(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(reversedArray));
    }
}
