package Inheritance;

public class Skier extends Sportsman{
    public Skier(String name, String team, short age) {
        super(name, team, age);
    }

    public void overtook() {
        System.out.println("Обогнал оппонента");
    }

}
