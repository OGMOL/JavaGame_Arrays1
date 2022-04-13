public class SumOfArrayDigits {
    public static void main(String[] args) {
        int[] arr = {138, -23, 6};
        int sumArrayDigits = getArrayDigits(arr);
        System.out.println("Sum array digits = " + sumArrayDigits);
    }

    public static int getArrayDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            while (Math.abs(arr[i]) > 0) {
                sum += Math.abs(arr[i]) % 10;
                arr[i] = arr[i] / 10;
            }
        }
        return sum;
    }

}
