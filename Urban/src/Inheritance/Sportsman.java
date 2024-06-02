package Inheritance;
/*
1.     Создать класс Sportsman с полями строкового типа name, team, поле age – целое число, все поля отмечены модификатором private.
Cоздать конструктор класса и методы get для доступа к полям класса. В классе есть метод, описывающий общее действие спортсмена.

Создать классы наследники Footballer, HockeyPlayer, Skier. В каждом из них написать свой дополнительный (относящийся к конкретному классу) метод,
например, у класса Footballer может быть метод scoringGoals, характеризующий результативную игру забиванием голов, у других классов методы будут свои.

В классе с методом main создать экземпляры классов – наследников, по 2 на каждый класс.
Вывести информацию о каждом экземпляре класса и действие всех имеющихся методов.
 */


public class Sportsman {
    private String name;
    private String team;
    private short age;

    public Sportsman(String name, String team, short age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public void play() {
        System.out.println(name + " участвует в соревнованиях");
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public short getAge() {
        return age;
    }
}
