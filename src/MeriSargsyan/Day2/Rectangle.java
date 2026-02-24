package MeriSargsyan.Day2;

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

            Rectangle rect = new Rectangle();

            rect.width = 5;
            rect.height = 3;

            System.out.println("Մակերես: " + rect.area());
            System.out.println("Պարագիծ: " + rect.perimeter());
        }
    }

