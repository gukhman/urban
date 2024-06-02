package Inheritance;

public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, short age) {
        super(name, team, age);
    }

    public void fouled() {
        System.out.println("Сфолил");
    }
}