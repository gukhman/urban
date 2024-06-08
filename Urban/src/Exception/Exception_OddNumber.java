package Exception;
//Код Александра
public class Exception_OddNumber {
    public static void main(String[] args) {
        int n = 18;
        tryNumber(n);
        n = 7;
        tryNumber(n);
    }

    public static void tryNumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
