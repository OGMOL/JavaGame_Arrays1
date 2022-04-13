import java.util.Arrays;

public class TwoSmallestArrayElements {
    public static void main(String[] args) {
        int[] arr = {8, 12, -20, 66, 3, -5, -19, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        getTwoSmallestArrayElements(arr);
        int[] twoSmallestElements = getTwoSmallestArrayElements(arr);
        System.out.println("Two smallest array elements = " + Arrays.toString(twoSmallestElements));

    }

    public static int[] getTwoSmallestArrayElements(int[] arr) {
        int[] arrTwoSmallestElements = new int[2];
        int smallestElement1 = arr[0];
        int indexSmallestElement1 = 0;
        int smallestElement2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement1) {
                smallestElement1 = arr[i];
                indexSmallestElement1 = i;
            }
        }
        smallestElement2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement2 && i != indexSmallestElement1) {
                smallestElement2 = arr[i];
            }
        }
        arrTwoSmallestElements[0] = smallestElement1;
        arrTwoSmallestElements[1] = smallestElement2;
        return arrTwoSmallestElements;
    }

}
