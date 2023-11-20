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
        int[] reverseArray = new int[sourceArray.length];
        for (int i = sourceArray.length -1; i >= 0; i--) {
            int reverseIndex = (sourceArray.length - 1) - i;
            reverseArray[reverseIndex] = sourceArray[i];
        }
        return reverseArray;
    }

    public int[] reverse2(int[] sourceArray) {
        int[] newArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            int reverseIndex = (sourceArray.length - 1) - i;
            newArray[i] = sourceArray[reverseIndex];
        }
        return newArray;
    }
}

