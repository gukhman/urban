package Exception;

public class Exception1 {

    public void main() {
        for (int i = -10; i <= 10; i++) {
            System.out.println(input(i));
        }
    }

    //Метод принимает на вход целое число и возвращает 0 или 1
    // в зависимоти от того четное или нет число
    public String input(int num) {
        int res;
        try {
            // выражение вызовет ArithmeticException (деление на 0),
            // если число num нечетное
            res = num / (Math.abs(num) % 2 - 1);
        } catch (ArithmeticException e) {
            res = 0;
        }

        //форматируем вывод
        return (output(num, res));
    }

    private String output(int num, int numResult) {
        String strResult;

        if (numResult == 0) {
            strResult = num + " - Передано нечетное число!";
        } else {
            {
                strResult = num + " - это четное число";
            }
        }
        return strResult;
    }
}
