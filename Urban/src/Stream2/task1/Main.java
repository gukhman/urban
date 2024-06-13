package Stream2.task1;

import java.util.ArrayList;
import java.util.stream.Stream;

/*Напишите программу для вычисления суммы всех четных и
нечетных чисел в списке с использованием потоков.*/
public class Main {
    public static void main(String[] args) {
        //заполняем ArrayList числами
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 20; i += 3) {
            intList.add(i);
        }
        System.out.println("Исходный список чисел: " + intList);
        //Делаем поток из ArrayList
        Stream<Integer> intStream = intList.stream();
        System.out.println("Сумма четных чисел = " +
                intStream.filter(even -> even % 2 == 0).reduce(0, Integer::sum));
        Stream<Integer> intStream2 = intList.stream();
        System.out.println("Сумма нечетных чисел = " +
                intStream2.filter(odd -> odd % 2 == 1).reduce(0, Integer::sum));
    }
}
