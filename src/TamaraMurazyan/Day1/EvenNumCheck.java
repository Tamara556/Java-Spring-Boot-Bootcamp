package TamaraMurazyan.Day1;

public class EvenNumCheck {
    public static boolean evenNumCheck(int num) {
        return num % 2 == 0;
    }
    static void main() {
        int num = 10;
        System.out.println(evenNumCheck(num));
    }
}
