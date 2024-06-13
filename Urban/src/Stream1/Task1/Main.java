package Stream1.Task1;
/*Создайте список типа String, например, названия пищевых продуктов.
Напишите программу для подсчета количества строк в списке,
начинающихся с определенной буквы, с использованием потоков.*/

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Создаем поток
        Stream<String> food = Stream.of("Банан", "Хлеб", "Мясо", "Огурец",
                "Курица", "Макадамия", "Творог", "Апельсин");
        char let = 'М';
        String reg = let + ".*";
        //Выведем Количество продуктов, начинающихся с буквы указанной
        // в переменной let, используя regex и count()
        System.out.println("Количество слов, начинающихся на букву "
                + let + ": " + food.filter(x -> x.matches(reg)).count());
    }
}