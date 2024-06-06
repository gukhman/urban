package Exception;

import java.util.Scanner;

public class Exception1 {
    public void main() throws Exception {
        int a = input();
        if (a % 2 == 1) throw new Exception("Передано нечетное число!");
        System.out.println(a + " - это четное число");
    }

    public int input() throws Exception {
        System.out.print("Введите четное число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
