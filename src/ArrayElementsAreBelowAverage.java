import java.util.Arrays;

public class ArrayElementsAreBelowAverage {
    public static void main(String[] args) {
        int[] arr = {8, 12, 66, 3, -5, -20, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        double average = getAverage(arr);
        System.out.println("Average = " + average);
        getArrayElementsBelowAverage(arr);
        int[] arrBelowAverage = getArrayElementsBelowAverage(arr);
        System.out.println("Array elements below average = " + Arrays.toString(arrBelowAverage));
    }

    public static double getAverage(int[] arr) {
        double sumArrElements = 0;
        double countArrElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArrElements += arr[i];
            countArrElements++;
        }
        double average = sumArrElements / countArrElements;
        return average;
    }

    public static int[] getArrayElementsBelowAverage(int[] arr) {
        int countBelowAverageArrElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getAverage(arr)) {
                countBelowAverageArrElements++;
            }
        }
        int[] arrayElementsBelowAverage = new int[countBelowAverageArrElements];
        int countNewArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getAverage(arr)) {
                arrayElementsBelowAverage[countNewArray] = arr[i];
                countNewArray++;
            }
        }
        return arrayElementsBelowAverage;
    }
}
