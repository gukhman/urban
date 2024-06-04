package Interfaces;

public class Human implements Swimmable, Flyable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("Android dev " + name + " полетел на вертолете в ресторан, " +
                "\nпотому что может себе это позволить. Но в основном люди летают на самолетах по своим делам");
    }

    @Override
    public void swim() {
        System.out.println("Человек плывет, используя поочередно брас, кроль, баттерфляй или на спине");
    }
}
