package Classes;

public class Classes {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(9, 4);
        calculator.mult(9, 4);
        calculator.div(9, 4);
        System.out.println("a - b = " + calculator.subtr(9, 4));
        System.out.println("a + b = " + calculator.add(9, 4));

    }

}
