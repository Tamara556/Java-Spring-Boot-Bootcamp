package MariamHovhannisyan.Day2;

public class Person {

    String name;
    int age;

    boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Anna";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "Aram";
        p2.age = 15;

        System.out.println(p1.name + " " + p1.isAdult());
        System.out.println(p2.name + " " + p2.isAdult());
    }
}