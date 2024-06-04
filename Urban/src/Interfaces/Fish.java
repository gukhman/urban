package Interfaces;

public class Fish implements Swimmable {
    String name;
    int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        if (name.equals("Нетопырь")) {
            System.out.println(name + " - это одна из тех редких рыб, которая, " +
                    "несмотря на жизнь в океане, не умеет плавать");
        } else {
            System.out.println(name + " великолепно плавает");
        }
    }
}