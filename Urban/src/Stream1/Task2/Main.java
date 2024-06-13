package Stream1.Task2;
/*Создать класс Person с полями name и age. В классе с методом main создать
список, состоящий не менее, чем из 10 объектов класса Person с
произвольными данными. Отфильтровать и вывести в консоль объекты Person,
возраст которых более 30 лет*/

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(
                new Person("Валентина", 36),
                new Person("Андрей", 20),
                new Person("Мария", 53),
                new Person("Антон", 28),
                new Person("Виктория", 29),
                new Person("Максим", 34),
                new Person("Светлана", 23),
                new Person("Алексей", 45),
                new Person("Алёна", 54),
                new Person("Сергей", 78),
                new Person("Дарья", 23),
                new Person("Павел", 56),
                new Person("Мелания", 44),
                new Person("Александр", 21),
                new Person("Полина", 25)
        );
        personStream.filter(x -> x.getAge() > 30).forEach(x ->
                System.out.println(x.getName() + " " + x.getAge()));
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}