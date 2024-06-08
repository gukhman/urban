package Generics.G2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Integer[] arr = {1, 2, 3};      //Работает
        String[] arr = {"1", "2", "3"};       //Тоже работает
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Generic generic = new Generic<>(arr);
        Object[] arr2 = generic.change(0, 2);
        System.out.println("Массив со сменой элементов: " + Arrays.toString(arr2));
    }
}
