package Interfaces;

public class Bird implements Swimmable, Flyable {
    String name;
    String type;
    int age;

    public Bird(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Гуси и пингвины плывают");
    }

    @Override
    public void fly() {
        System.out.println("Все птицы летают. Но некоторым требуется парашют (•◡•)");
    }
}
