package Lambda.Task1;

import java.util.ArrayList;

/*Напишите программу, реализующую лямбда-выражение для
вычисления суммы всех четных элементов списка.*/
public class Main {
    public static void main(String[] args) {

        //заполняем ArrayList числами 1..100
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            intList.add(i);
        }

        //чтобы не писать весь код лямбда-выражение, вынесем его в отдельный метод sumEvenMethod()
        //SumFunctionInterface sumEven = (a) -> sumEvenMethod(a); //лямбда-выражение
        SumFunctionInterface sumEven = Main::sumEvenMethod;       //Ссылка на метод (Method Reference) – это сокращенная форма лямбда выражения
        int result = sumEven.Sum(intList);
        System.out.println("Исходный список чисел:\n" + intList);
        System.out.println("Сумма четных чисел из списка: " + result);
    }

    private static int sumEvenMethod(ArrayList<Integer> intArr) {
        int result = 0;
        for (int i = 0; i < intArr.size(); i++) {
            //intArr.get(i) возвращает Integer. У Integer можно вызвать метод equals(),
            //однако elem % 2 возвращает примитив int, который не позволяет использовать методы
            int elem = intArr.get(i);
            if ((elem % 2) == 0) {
                result += elem;
            }
            /*Integer elem = intArr.get(i);
            if ((elem % 2) == 0) {
                result += elem;
            }*/
        }
        return result;
    }
}
