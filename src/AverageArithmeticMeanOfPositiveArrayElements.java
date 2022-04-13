import java.util.Arrays;

public class AverageArithmeticMeanOfPositiveArrayElements {
    public static void main(String[] args) {
        int[] arr = {8, -75, -20, 66, 3, -5, 67, 11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        System.out.println("Positive arrray = " + Arrays.toString(getPositiveArrayElements(arr)));
        int sum = getSumArraysElements(getPositiveArrayElements(arr));
        System.out.println("Sum positive array elements = " + sum);
    }

    public static int[] getPositiveArrayElements(int[] arr) {
        int countPositiveElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositiveElements++;
            }
        }
        int[] arrayPositiveElements = new int[countPositiveElements];
        int countNewPositiveArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrayPositiveElements[countNewPositiveArray] = arr[i];
                countNewPositiveArray++;
            }
        }
        return arrayPositiveElements;
    }

    public static int getSumArraysElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
