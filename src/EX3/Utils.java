package EX3;

public class Utils {
    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        T maxElement = array[0];
        for (T element : array) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }
}

