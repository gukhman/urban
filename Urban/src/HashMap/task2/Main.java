package HashMap.task2;
/*Создайте HashMap c ключами Integer, значениями – String. Напишите метод,
который возвращает ассоциативный массив, состоящий из элементов исходного map,
при условии, что туда войдут элементы с длиной строки более 3.
Т.е. исходный map: [1="Red",2="Green",3="Black"].
Новый map: [2="Green",3="Black"].*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> mapWithValueMore3 = new HashMap<>();
        HashMap<Integer, String> newMap = new HashMap<>();
        //заполняем значениями
        putStartValues(newMap);

        System.out.println("Исходная карта:\n" + newMap);
        mapWithValueMore3 = delEntryWithValueLess4(newMap);
        System.out.println("Карта, у которой длина элементов более трех:\n" + mapWithValueMore3);

    }

    private static HashMap<Integer, String> delEntryWithValueLess4(HashMap<Integer, String> map) {
        HashMap<Integer, String> resMap = new HashMap<>();
        //получем пары ключ+значение, извлекаем ключ и записываем его в keysSet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String Value = entry.getValue();
            //System.out.println(Value.length());
            if (Value.length() > 3) {
                resMap.put(key, Value);
            }
        }
        return resMap;
    }
    private static void putStartValues(HashMap<Integer, String> newMap) {
        newMap.put(1, "HashMap");
        newMap.put(2, "LinkedHashMap");
        newMap.put(3, "Ma");
        newMap.put(4, "M");
        newMap.put(5, "TreeMap");
        newMap.put(6, "Map");
    }
}
