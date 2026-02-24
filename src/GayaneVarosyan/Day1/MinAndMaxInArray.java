package GayaneVarosyan.Day1;

public class MinAndMaxInArray {
    public static int[] minAndMaxInArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
    static void main() {
        int[] arr = {3, 5, 1, 8, 2};
        int[] result = minAndMaxInArray(arr);
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}
