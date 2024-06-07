package Exception;

import java.util.Scanner;

public class Exception2 {
    public void main() throws Exception {

        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        output(in.nextLine());

    }

    public void output(String str) throws Exception {
        String reg = ".*\\d.*";
        if (str.matches(reg)) {
            throw new Exception("Строка содержит как минимум 1 число!");
        }
        System.out.println("Строка не содержит ни одного числа");
    }

}
