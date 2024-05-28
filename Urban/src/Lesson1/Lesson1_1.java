package Lesson1;

public class Lesson1_1 {

	public static void main(String[] args) {
		int a = 5;
		double b = 3.6;
		char c = 'w';
		double result = a + b + c; // интересно что при сложении нет ошибки. Интуитивно хочется складывать a + b + (int)c
		System.out.println(result);
	}

}
