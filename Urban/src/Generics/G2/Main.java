package Generics.G2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        String out = "";
        Generic generic = new Generic<String>(arr);
        Object[] arr2 = generic.change(0, 2);
        System.out.println("Массив со сменой элементов: " + Arrays.toString(arr2));
    }
}
