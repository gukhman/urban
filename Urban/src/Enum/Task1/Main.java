package Enum.Task1;
/*Необходимо написать метод, который возвращает позицию буквы алфавита.
Для реализации программы создать enum алфавита.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Alphabet.T.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        int getLetterPosition() {
            int result;
            result = this.ordinal();
            return result;
        }
    }
}
