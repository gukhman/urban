package Generics.G1;

/*
Напишите метод, который принимает два массива одного типа и проверяет,
содержат ли они одинаковые элементы в одном и том же порядке.
*/
public class Generic {
    static <A, A2 extends A> boolean isItEquals(A[] arr, A2[] arr2) {
        boolean res = true;
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    res = false;
                }
            }
        } else {
            res = false;
        }

        return res;
    }
}