package Exception;

import java.util.Scanner;

public class Exception2 {
    public void main() throws Exception{
        String a = input();
        String reg = ".*\\d.*";
        if (a.matches(reg)) throw new Exception("Строка содержит числа!");
    }

    public String input() throws Exception {
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
