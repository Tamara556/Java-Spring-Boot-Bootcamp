package MariamHovhannisyan.Day1;

public class Work2 {
    public static void main(String[] args) {

        int [] arr = {5,6,7,9};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
