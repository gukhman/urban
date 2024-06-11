package Enum.Task2;

import java.util.Scanner;

/*Написать класс Person с полями имени(name), возраста(age). Для определения пола Person создать enum Gender
с соответствующими константами. В классе с методом main создать список объектов Person, состоящий не менее,
чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person
в зависимости от введенного параметра пола, т.е. список мужчин или женщин.*/
public class Main {
    public static void main(String[] args) {
        //Заполняем массив Person[]
        Person[] personArr = Person.putStartValues();
        //Ввод пола
        System.out.print("Введите пол\n 0 - мужской; 1 - женский: ");
        String inputGender = inputGenderProcessing(new Scanner(System.in));
        //перебираем массив и выводим
        outPersonByGender(personArr, inputGender);
    }

    private static String inputGenderProcessing(Scanner in) {
        String input = in.nextLine();

        if (input.equals("0")) {
            input = "мужской";
        } else if (input.equals("1")) {
            input = "женский";
        } else {
            System.out.println("Некорректно введено значение!");
            System.exit(0);
        }

        return input;
    }

    private static void outPersonByGender(Person[] personArr, String gender) {
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getGender().title.equals(gender)) {
                System.out.println(personArr[i]);
            }
        }
    }

    public static class Person {
        private String name;
        private int age;
        private Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public static Person[] putStartValues() {

            Person person = new Person("Дмитрий", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person2 = new Person("Виктория", (int) (Math.random() * 82 + 18), Person.Gender.Female);
            Person person3 = new Person("Алексей", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person4 = new Person("Александр", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person5 = new Person("Полина", (int) (Math.random() * 82 + 18), Person.Gender.Female);
            Person person6 = new Person("Карина", (int) (Math.random() * 82 + 18), Person.Gender.Female);
            Person person7 = new Person("Василий", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person8 = new Person("Сергей", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person9 = new Person("Андрей", (int) (Math.random() * 82 + 18), Person.Gender.Male);
            Person person10 = new Person("Диана", (int) (Math.random() * 82 + 18), Person.Gender.Female);
            Person[] personArr = {person, person2, person3, person4, person5, person6, person7, person8, person9, person10};
            return personArr;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        private enum Gender {
            Male("мужской"), Female("женский");
            private String title;

            Gender(String title) {
                this.title = title;
            }

            public String getTitle() {
                return title;
            }

            @Override
            public String toString() {
                return "Gender{" + "title='" + title + '\'' + '}';
            }
        }
    }
}
