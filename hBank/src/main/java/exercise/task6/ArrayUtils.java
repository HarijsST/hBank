package exercise.task6;

public class ArrayUtils {
    public int[] source = {};

    public ArrayUtils(int[] source) {
        this.source = source;
    }

    public int[] getSource() {
        return source;
    }

    public int[] copy(int[] sourceArray) {
        return getSource();
    }

    public int[] reverse(int[] sourceArray) {
        int[] reverseArray = {};
        for (int i = sourceArray.length; i >= 0; i--) {
            reverseArray[i] = sourceArray[i];
        }
        return reverseArray;
    }
}

