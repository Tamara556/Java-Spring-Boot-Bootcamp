package MeriSargsyan;

public class work3 {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));  // true
        System.out.println(isEven(7));  // false
    }
}

