package Anonymous.Task1;

import java.lang.reflect.Method;

/*Написать функциональный интерфейс Printable с методом print().
В классе с методом main создать несколько анонимных классов
с различными реализациями метода print().*/

@FunctionalInterface
interface Printable {
    void print(String str);
}

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printable() {
            @Override
            public void print(String str) {
                System.out.println(str + "Это самая простая реализация функционального интерфейса");
            }
        };
        printer.print("1. ");

        Printable xerox = new Printable() {
            @Override
            public void print(String str) {
                String res = "";
                Method[] declaredMethods = Main.class.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    //Выводим имя
                    res += "    - " + method.getName() + "\n";
                }
                System.out.println(str + res);
            }
        };
        xerox.print("2. Выведем список методов класса Main:\n");
    }
}
