package Debugger.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*Дан массив целых чисел. Найти максимальное число из четных в этом массиве.*/
public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 56, 2, 73, 6, 5, 36, 23, 3, 2, 1};
        System.out.println("Исходный список чисел: " + Arrays.toString(intArr));

        Stream<Integer> intStream = Arrays.stream(intArr);
        //фильтруем четные числа и с помощью Comparator находим максимальное
        System.out.println("Самое большое четное число: " +
                intStream.filter(even -> even % 2 == 0).max(Comparator.comparingInt(x -> x)).get());
    }
}
