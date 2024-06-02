package Inheritance;

public class Footballer extends Sportsman {
    public Footballer(String name, String team, short age) {
        super(name, team, age);
    }

    public void run() {
        System.out.println("бежит");
    }
}
