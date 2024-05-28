package If_switch;

public class If_switch2 {

	public static void main(String[] args) {

		int day;
		day = 15;

		if (day > 0 && day <= 10) {
			System.out.println("День " + day + " принадлежит к 1-й декаде месяца");
		} else if (day > 10 && day <= 20) {
			System.out.println("День " + day + " принадлежит ко 2-й декаде месяца");
		} else if (day > 20 && day <= 31) {
			System.out.println("День " + day + " принадлежит к 3-й декаде месяца");
		} else {
			System.out.println("День " + day + " введен некорректно");
		}

	}

}
