package MeriSargsyan.Day2;

public class Person {

        String name;
        int age;

        boolean isAdult() {
            return age >= 18;
        }

        public static void main(String[] args) {

            // Person 1
            Person p1 = new Person();
            p1.name = "Meri";
            p1.age = 20;

            // Person 2
            Person p2 = new Person();
            p2.name = "lilik";
            p2.age = 15;

            // Testing
            System.out.println(p1.name + " is adult: " + p1.isAdult());
            System.out.println(p2.name + " is adult: " + p2.isAdult());
        }
    }
