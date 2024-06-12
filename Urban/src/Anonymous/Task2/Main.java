package Anonymous.Task2;
/*Написать функциональный интерфейс Concationble с методом concat(),
который объединяет две строковых переменных, передаваемых в параметры метода и возвращает строку.
В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().*/


public class Main {
    public static void main(String[] args) {
        System.out.println(concatStrings("Hello", " world!", (a, b) -> a + b));
        System.out.println("Число 35 в двоичной системе записывается как " +
                concatStrings("0", "1", (a, b) -> b + a + a + a + b + b));
    }

    public static String concatStrings(String str1, String str2, Concationble<String, String> concation) {
        return concation.concat(str1, str2);
    }
}

@FunctionalInterface
interface Concationble<T, V> {
    String concat(T t, V v);
}