package MeriSargsyan.Day1;

public class work1 {
    public static void main(String[] args) {
        String input = "Meri";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reverse: " + reversed);
    }
}

