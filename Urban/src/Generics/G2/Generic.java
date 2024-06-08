package Generics.G2;

// Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
public class Generic<T> { //обобщенный класс(принимает любой тип)
    T[] arr;              //массив arr типа, переданного при создании объекта класса Generic

    public Generic(T[] arr) { //конструктор
        this.arr = arr;
    }

    T[] change(int posNum, int posNum2) { //метод смены 2 элементов
        //boolean notChanged = true;  //флаг смены
        //while (notChanged) {
        if (arr.length > posNum && arr.length > posNum2) {
            T temp = arr[posNum];
            arr[posNum] = arr[posNum2];
            arr[posNum2] = temp;
        } else {
            System.out.println("Длина массива составляет " + arr.length +
                    ", введите корректные индексы элементов для смены(0-" + (arr.length-1) + ")");
        }
        //    notChanged = false;
        //}
        return arr;
    }
}
