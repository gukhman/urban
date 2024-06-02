package Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Кержаков", "ЦСКА", (short) 25);
        Footballer footballer2 = new Footballer("Аршавин", "Спартак", (short) 28);
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Овечкин", "Washington Capitals", (short) 38);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Харламов", "СССР", (short) 24);
        Skier skier1 = new Skier("Большунов", "РФ", (short) 27);
        Skier skier2 = new Skier("Устюгов", "Россия", (short) 32);

        System.out.println("Футболисту " + footballer1.getName() + " из команды " + footballer1.getTeam() + " сейчас " + footballer1.getAge() + " лет");
        footballer1.play();
        footballer1.run();
        System.out.println("Футболисту " + footballer2.getName() + " из команды " + footballer2.getTeam() + " сейчас " + footballer2.getAge() + " лет");
        footballer2.play();
        footballer2.run();

        System.out.println("Хоккеисту " + hockeyPlayer1.getName() + " из команды " + hockeyPlayer1.getTeam() + " сейчас " + hockeyPlayer1.getAge() + " лет");
        hockeyPlayer1.play();
        hockeyPlayer1.fouled();
        System.out.println("Хоккеисту " + hockeyPlayer2.getName() + " из команды " + hockeyPlayer2.getTeam() + " сейчас " + hockeyPlayer2.getAge() + " лет");
        hockeyPlayer2.play();
        hockeyPlayer2.fouled();

        System.out.println("Лыжнику " + skier1.getName() + " из команды " + skier1.getTeam() + " сейчас " + skier1.getAge() + " лет");
        skier1.play();
        skier1.overtook();
        System.out.println("Лыжнику " + skier2.getName() + " из команды " + skier2.getTeam() + " сейчас " + skier2.getAge() + " лет");
        skier2.play();
        skier2.overtook();
    }
}
