package Classes;

public class Calculator {
	double a;
	double b;

	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void mult(double a, double b) {
		System.out.println("a * b = " + a * b);
	}
	public void div(double a, double b) {
		System.out.println("a / b = " + a / b);
	}
	public double subtr(double a, double b) {
		return a - b;
	}
	public double add(double a, double b) {
		return a + b;
	}
}
