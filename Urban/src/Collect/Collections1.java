package Collect;
/*
Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
Напишите метод для поиска элемента в списке массивов. На вход метод принимает параметр поиска.
Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red»,
то метод должен вернуть true, символизируя то, что этот цвет содержится в списке.
*/
import java.util.ArrayList;

public class Collections1 {
    public static void main(String[] args) {
        //Создаем и наполняем ArrayList
        ArrayList<String> aList = new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("blue");
        System.out.println(output("yellow", aList)); //вернет false
        System.out.println(output("blue", aList)); //вернет true
    }

    private static boolean output(String whatToSearch, ArrayList list) {
        //return list.contains(whatToSearch); //есть встроенный метод, но мы напишем свой
        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == whatToSearch) {
                result = true;
                break; //если нашли элемент, то нет смысла пробегать весь оставшийся ArrayList
            }
        }
        return result;
    }
}
