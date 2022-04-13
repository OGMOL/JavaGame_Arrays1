import java.util.Arrays;

public class SumOfEvenPositiveArrayElements {
    public static void main(String[] args) {
        int[] arr = {8, 12, 7, 3, -5, -2, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        int[] arrEven = getEvenElements(arr);
        System.out.println("Even array elements = " + Arrays.toString(arrEven));
        int[] arrPos = getPositiveElements(arrEven);
        System.out.println("Positive array elements = " + Arrays.toString(arrPos));
        int sum = getSumArrayElements(arrPos);
        System.out.println("Sum = " + sum);
    }

    public static int[] getEvenElements(int[] arr) {
        int countEventElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEventElements++;
            }
        }
        int[] arrayEventElements = new int[countEventElements];
        int countNewArr = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                arrayEventElements[countNewArr] = arr[j];
                countNewArr++;
            }
        }
        return arrayEventElements;
    }

    public static int[] getPositiveElements(int[] arr) {
        int countPositiveElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositiveElements++;
            }
        }
        int[] arrayPositiveElements = new int[countPositiveElements];
        int countNewArr = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                arrayPositiveElements[countNewArr] = arr[j];
                countNewArr++;
            }
        }
        return arrayPositiveElements;
    }

    public static int getSumArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
