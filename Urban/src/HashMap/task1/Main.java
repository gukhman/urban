package HashMap.task1;
/*Создайте HashMap c ключами Integer, значениями – String.
Напишите метод, который возвращает набор ключей,
содержащихся в этой карте.*/

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "HashMap");
        map.put(2, "LinkedHashMap");
        map.put(3, "TreeMap");
        System.out.println("Исходная карта:" + map);

        //System.out.println(map.keySet()); //Есть готовый вариант вывода ключей
        System.out.println("Ключи исходной карты" + getKeys(map));   //но мы используем свой метод
    }

    //метод принимает HashMap(ключ+значение) и отдает LinkedHashSet(набор ключей)
    private static LinkedHashSet<Integer> getKeys(HashMap<Integer, String> map) {
        LinkedHashSet<Integer> keysSet = new LinkedHashSet<>();
        //получем пары ключ+значение, извлекаем ключ и записываем его в keysSet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            keysSet.add(entry.getKey());
        }
        return keysSet;
    }
}
