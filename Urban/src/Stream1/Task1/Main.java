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
        //Выведем продукты, начинающиеся с буквы "М", используя regex
        food.filter(x->x.matches("М.*")).forEach(x-> System.out.println(x));
    }
}