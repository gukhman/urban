package Sets.stringHashset;
/*Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //создаем 3 HashSet, в resHashSet будут выводиться одинаковые элементы
        HashSet<String> strHashSet2 = new HashSet<>(Arrays.asList("red", "green", "blue", "black", "white", "brown", "grey"));
        HashSet<String> strHashSet = new HashSet<>(Arrays.asList("red", "green", "white", "grey", "yellow", "orange"));
        HashSet<String> resHashSet = new HashSet<>();
        /*
        будем искать элементы из меньего по размеру множества в большем,
        для этого вычисляем какое из множеств больше, а какое меньше
        */
        HashSet<String> minHS = minSizeHashSet(strHashSet, strHashSet2);
        HashSet<String> maxHS = maxSizeHashSet(strHashSet, strHashSet2);
        //Для перебора HashSet использаем итератор
        Iterator<String> minHSI = minHS.iterator();
        while (minHSI.hasNext()) {
            //если элемент из меньшего множества есть в большем, то добавляем элемент в результат
            String item = minHSI.next().toString();
            if (maxHS.contains(item)) {
                resHashSet.add(item);
            }
        }
        System.out.println("Элементы, которые есть в обоих множествах: " + resHashSet);
    }

    private static HashSet minSizeHashSet(HashSet HS1, HashSet HS2) {
        if (HS1.size() <= HS2.size()) {
            return HS1;
        } else {
            return HS2;
        }
    }

    private static HashSet maxSizeHashSet(HashSet HS1, HashSet HS2) {
        if (HS1.size() > HS2.size()) {
            return HS1;
        } else {
            return HS2;
        }
    }
}
