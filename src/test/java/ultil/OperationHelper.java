package ultil;

public class OperationHelper {
	public static void calculator1(String input) {
		Calculator cal = new Calculator();
		cal.calculate1(input);
	}

	public static void calculator2(String input) {
		Calculator cal = new Calculator();
		cal.calculate2(input);
	}

	public static void calculator3(String input) {
		Calculator cal = new Calculator();
		cal.calculate3(input);
	}

	public static void calculator4(String input) {
		Calculator cal = new Calculator();
		cal.calculate4(input);
	}

	public static void calculator5(int numberOne, String operator, int numberTwo) {
		Calculator cal = new Calculator();
		cal.calculate5(numberOne, operator, numberTwo);

	}
	public static void calculator() {
		Calculator cal = new Calculator();
		cal.plus();
		cal.sub();
		cal.devide();
		cal.multi();
		
	}

}
