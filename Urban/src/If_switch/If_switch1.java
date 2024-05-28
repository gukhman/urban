package If_switch;

public class If_switch1 {

	public static void main(String[] args) {
		int x, y;
		x = 3;
		y = 7;
		if ((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
			System.out.println("Удачное совпадение");
		}
	}

}