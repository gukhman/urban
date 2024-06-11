package Sets.intHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2*/
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<intHashSet> intHashSet = new LinkedHashSet<>();
        LinkedHashSet<intHashSet> resHashSet = new LinkedHashSet<>();
        for (int i = 10; i < 21; i++) {
            intHashSet.add(new intHashSet(i));
        }
        //Для перебора HashSet использаем итератор
        Iterator<intHashSet> intHashSetI = intHashSet.iterator();
        while (intHashSetI.hasNext()) {
            System.out.println(intHashSetI.next());
        }
    }
}


