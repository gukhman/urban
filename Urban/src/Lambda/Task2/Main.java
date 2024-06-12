package Lambda.Task2;
/*Напишите программу, реализующую лямбда-выражение для определения
самого длинного слова в списке, состоящего из нескольких слов.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Заполняем список элементами
        String ALCauchy = "Число А называется пределом функции f(x), при условии, что х→+∞, " +
                "если для любого ε>0 существует соответствующее ему положительное число δ такое, " +
                "что для всех значений аргумента х, которые удовлетворяют условию " +
                "х>δ выполняется неравентсво | ( ) – A| <ε";
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(ALCauchy.split(" ")));
        //вызываем лямбда-функцию поиска самого длинного слова
        LongWord LW = LongWordClass::LongWordMethod;
        String[] res = LW.lWord(strList);
        //выводим результат
        System.out.println("Исходный список строк:\n" + strList);
        System.out.println("Самое длинное слово из массива:\n   "
                + res[0] + "\nУказанное слово содержит " + res[1] + " символов.");
    }
}
