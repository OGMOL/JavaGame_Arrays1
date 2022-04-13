import java.util.Arrays;

public class MaxNegativeArrayElement {
    public static void main(String[] args) {
        int[] arr = {8, -75, -20, 66, 3, -55, 67, 11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        int maxNegative = getMaxNegativeElement(arr);
        int maxNegativeIndex = getMaxNegativeIndexElement(arr);
        System.out.println("Max negative element = " + maxNegative);
        System.out.println("Max negative index = " + maxNegativeIndex);
    }
    public static int getMaxNegativeElement(int[] arr) {
        int maxNegative = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNegative > arr[i]) {
                maxNegative = arr[i];
            }
        }
        return maxNegative;
    }

    public static int getMaxNegativeIndexElement(int[] arr) {
        int maxNegative = arr[0];
        int indexMaxNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNegative > arr[i]) {
                maxNegative = arr[i];
                indexMaxNegative = i;
            }
        }
        return indexMaxNegative;
    }
}


