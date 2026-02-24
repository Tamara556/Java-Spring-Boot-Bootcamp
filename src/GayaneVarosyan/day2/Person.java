package GayaneVarosyan.day2;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    static void main() {
        String name = "Alice";
        int age = 2;

        Person person = new Person(name, age);
        System.out.println("Is " + person.name + " an adult? " + isAdult(person.age));
    }
}
