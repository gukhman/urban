package Lambda.Task2;
/*Напишите программу, реализующую лямбда-выражение для определения
самого длинного слова в списке, состоящего из нескольких слов.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*public class Main {
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
}*/

public class Main {
    public static void main(String[] args) {
        List list1 = Arrays.asList("Привет", "как","Трансформатор", "дела");
        Operation operation = list -> {
            String result = list.get(0);
            int max = list.get(0).length();
            for (int i = 0; i < list.size(); i++) {
                if (max < list.get(i).length()) {
                    result = list.get(i);
                }
            }
            return result;
        };
        System.out.println(operation.calculate(list1));
    }
}

interface Operation {
    String calculate(List<String> list);
}