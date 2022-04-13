public class SumArrElementsModulAfterNegative {
    public static void main(String[] args) {
        int[] arr = {8, -12, -20, 66, 3, -5, -19, -11, -8};
        getArrayAfterNegative(arr);
        int sum = getArrayAfterNegative(arr);
        System.out.println(sum);
    }

    public static int getArrayAfterNegative(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
         /*   System.out.println("count = " + count);*/
            if (arr[i] < 0) {
                for (int j = count; j < arr.length; j++) {
                    sum += Math.abs(arr[j]);
                    System.out.println(sum);
                }
            }
            if (arr[i] > 0) {
                continue;
            } else {
                break;
            }
        }
        return sum;
    }
}
