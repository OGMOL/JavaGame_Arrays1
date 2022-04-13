import java.util.Arrays;

public class CompressArrayInterval {
    public static void main(String[] args) {
        int[] arr = {8, 12, -20, 66, 3, -5, -4, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        getA(-5);
        getB(5);
        int a = getA(-5);
        int b = getB(5);
        System.out.println("Interval a = " + a);
        System.out.println("Interval b = " + b);
        int[] compressedArr = getCompressedArray(arr, getA(-5), getB(5));
        System.out.println("Compressed array = " + Arrays.toString(compressedArr));
    }

    public static int getA(int interval) {
        int a = interval;
        return a;
    }

    public static int getB(int interval) {
        int b = interval;
        return b;
    }

    public static int[] getCompressedArray(int[] arr, int inervalA, int intervalB) {
        int[] compressedArray = new int[9];
        int a = getA(inervalA);
        int b = getB(intervalB);
        int countCompressedArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a || arr[i] > b) {
                compressedArray[countCompressedArray] = arr[i];
                countCompressedArray++;
            }
        }
        return compressedArray;
    }
}
