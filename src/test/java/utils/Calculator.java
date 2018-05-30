package utils;

public class Calculator {
	private static int value = 0;
	private static int x = 100;
	private static int y = 0;
	// Author: Phuong Tran

	public static void calculate1(String valueInput) {
		// Do function in here
		// Exercise 1 
		// Case 1: "20+-*/80"
		String operators[] = valueInput.split("[0-9]+"); // Split all numbers
		String inputs[] = valueInput.split("[+-/*//]"); // Split all +-*/
		
		switch (operators[1]) {
		case "+":
			value = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]); // [0] is no array input																				
			System.out.println("Exercise 1: " + value);
			break;
		case "-":
			value = Integer.parseInt(inputs[0]) - Integer.parseInt(inputs[1]);
			System.out.println("Exercise 1: " + value);
			break;
		case "*":
			value = Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]);
			System.out.println("Exercise 1: " + value);
			break;
		case "/":
			double value1 = 0;
			if (Double.parseDouble(inputs[1]) == 0) {
				System.out.println("Cannot devide to 0");
			} else {
				value1 = Double.parseDouble(inputs[0]) / Double.parseDouble(inputs[1]);
				System.out.println("Exercise 1: " + value1);
			}
			break;
		}
	}


	// Case 2: "20+-*/     80"
	public static void calculate2(String valueInput) {
		valueInput = valueInput.replaceAll("\\s+", ""); // Remove all space and keep all characters
		calculate1(valueInput);
	}

	// Case 3: "20    +-*/     80"
	public static void calculate3(String valueInput) {
		valueInput = valueInput.replaceAll("\\s+", "");
		calculate1(valueInput);
	}



	// Case 4: "20dsdfggdfgd +-*/   fhdfhfdhfdhfdh80"
	public static void calculate4(String valueInput) {
		valueInput = valueInput.replaceAll("[^0-9.+-/*//]", ""); // Remove all characters and keep numbers and +-*/																	
		calculate2(valueInput);
	}

	// Exercise: 20+-*/80
	//public static void calculate5(int numberOne, String operator, int numberTwo) {

	public static void calculate5(int numberOne, String operator , int numberTwo) {
		switch (operator) {
		case "+":
			System.out.println("Exercise 2:" + (numberOne + numberTwo));
			
			break;
		case "-":
			System.out.println("Exercise 2:" + (numberOne - numberTwo));
			break;
		case "*":
			System.out.println("Exercise 2:" + (numberOne * numberTwo));
			break;
		case "/":
			if (numberTwo == 0) {
				System.out.println("Exercise - Can not devide to 0");
			} else {
				System.out.println("Exercise 2:" + (double) numberOne / (double) numberTwo);
				break;
			}
		}
	}

	// Exercise 3
	public static void plus() {
		System.out.println("Exercise 3: x+y:" + (x + y));
	}

	public static void sub() {
		System.out.println("Exercise 3: x-y:" + (x - y));
	}

	public static void devide() {
		if (y == 0) {
			System.out.println("Exercise 3: x/y Can not devide to 0");
		} else {
			System.out.println("Exercise 3: x/y:" + ((double) x / (double) y));
		}
	}

	public static void multi() {
		System.out.println("Exercise 3: x*y:" + (x * y));
	}
}
