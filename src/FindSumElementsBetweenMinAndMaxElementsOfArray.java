import java.util.Arrays;

public class FindSumElementsBetweenMinAndMaxElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {8, -75, -20, 66, 3, -5, 67, 11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        int sumElementsBetweenMinAndMax = getSumElementsBetweenMinAndMax(arr, getIndexMinElement(arr), getIndexMaxElement(arr));
        System.out.println("Sum elements between min and max elements = " + sumElementsBetweenMinAndMax);
    }

    public static int getIndexMinElement(int[] arr) {
        int indexMinElement = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                indexMinElement = i;
            }
        }
        return indexMinElement;
    }

    public static int getIndexMaxElement(int[] arr) {
        int indexMaxElement = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }

    public static int getSumElementsBetweenMinAndMax(int[] arr, int min, int max) {
        int sum = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        if (min < max) {
            firstIndex = min;
            secondIndex = max;
        } else {
            firstIndex = max;
            secondIndex = min;
        }
        int count = secondIndex - firstIndex - 1;

        for (int i = 1, z = 0; z < count; i++, z++) {
            sum += arr[firstIndex + i];
        }
        return sum;
    }
}
