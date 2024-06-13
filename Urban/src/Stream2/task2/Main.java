package Stream2.task2;

import java.util.Arrays;
import java.util.stream.Stream;

/*Напишите программу для удаления всех повторяющихся
элементов из списка с помощью потоков*/
public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1,3,2,4,6,5,5,4,3,2,1};
        System.out.println("Исходный список чисел: " + Arrays.toString(intArr));

        Stream<Integer> intStream = Arrays.stream(intArr);
        System.out.println("Уникальный список чисел: " +
                intStream.distinct().toList());
    }
}
