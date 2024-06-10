package Collect;

import java.util.LinkedList;

/*
        Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами
        первый и последний элементы этого списка и возвращает этот список в новом виде. Т.е., если создали
        список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].
*/
public class Collections2 {
    public static void main(String[] args) {

        LinkedList<Integer> intList = new LinkedList<>(); //инициализируем LinkedList
//        Добавляем 5 элементов
        for (int i = 1; i <= 5; i++) {
            intList.add(i);
        }
        System.out.println(intList);    //выводим получившийся LinkedList

        lastFirstChange(intList);       //меняем первый и последний элемент в LinkedList
        System.out.println(intList);    //выводим повторно
    }

    private static LinkedList lastFirstChange(LinkedList list) {
//        запоминаем первый и последний элементы
        Object first = list.getFirst();
        Object last = list.getLast();
//        Удаляем первый и последний элементы
        list.removeFirst();
        list.removeLast();
//        Первому элементу присваиваем значение последнего, а поледнему - значение первого
        list.addFirst(last);
        list.addLast(first);

        return list;
    }
}
