package MariamHovhannisyan.Day2;

public class Rectangle {

    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(); // object ստեղծում

        r.width = 7;
        r.height = 3;

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}
