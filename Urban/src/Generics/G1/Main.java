package Generics.G1;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};
        String[] arr2 = {"1", "2", "3", "4", "5"};
        if (Generic.isItEquals(arr, arr2)) {
            System.out.println("Массивы эквивалентны");
        } else {
            System.out.println("Массивы не эквивалентны");
        }
    }
}
