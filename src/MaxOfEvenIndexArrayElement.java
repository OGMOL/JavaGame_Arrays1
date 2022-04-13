import java.util.Arrays;

public class MaxOfEvenIndexArrayElement {
    public static void main(String[] args) {
        int[] arr = {8, 12, 7, 3, -5, -2, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        getEvenIndexArrayElement(arr);
        int[] arrEvenIndex = getEvenIndexArrayElement(arr);
        System.out.println("Even index array elements = " + Arrays.toString(arrEvenIndex));
        int maxOfEvenIndex = getMaxArrayElement(arrEvenIndex);
        System.out.println("Max of even index array element = " + maxOfEvenIndex);
    }

    public static int[] getEvenIndexArrayElement(int[] arr) {
        int countNewArrElements = 0;
        for (int i = 0; i < arr.length; i += 2) {
            countNewArrElements++;
        }
        int[] arrayEvenIndexElement = new int[countNewArrElements];
        int countNewArr = 0;
        for (int i = 0; i < arr.length; i += 2) {
            arrayEvenIndexElement[countNewArr] = arr[i];
            countNewArr++;
        }
        return arrayEvenIndexElement;
    }

    public static int getMaxArrayElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
