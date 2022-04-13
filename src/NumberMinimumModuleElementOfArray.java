import java.util.Arrays;

public class NumberMinimumModuleElementOfArray {
    public static void main(String[] args) {
        int[] arr = {8, 12, 1, 5, -5, -2, -11, -8};
        System.out.println("Input array = " + Arrays.toString(arr));
        int numberMinModElement = getMinArrayElement(getModuleArray(arr));
        System.out.println("Number min array element = " + numberMinModElement);
    }

    public static int[] getModuleArray(int[] arr) {
        int[] moduleArray = new int[8];
        for (int i = 0; i < arr.length; i++) {
            moduleArray[i] = Math.abs(arr[i]);
        }
        return moduleArray;
    }

    public static int getMinArrayElement(int[] arr) {
        int min = arr[0];
        int number = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                number = i;
            }
        }
        return number;
    }
}
