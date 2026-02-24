package TamaraMurazyan.Day2;

public class Rectangle {
    private double width;
    private double height;

    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static double area(double width, double height) {
        return width * height;
    }

    public static double perimeter(double width, double height) {
        return 2 * (width + height);
    }

    static void main() {
        double width = 5.0;
        double height = 3.0;

        System.out.println("Area: " + area(width, height));
        System.out.println("Perimeter: " + perimeter(width, height));
    }
}
