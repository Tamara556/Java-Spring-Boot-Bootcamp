package GayaneVarosyan.Day1;

public class StringReverse {
    public static String stringReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    static void main() {
        String str = "Hello World";
        System.out.println(stringReverse(str));
    }
}
