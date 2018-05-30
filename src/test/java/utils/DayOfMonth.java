package utils;

public class DayOfMonth {
	// input name of month, return day of month
	public static void countDay(String nameOfMonth) {

		if (nameOfMonth.toLowerCase().equals("april") || nameOfMonth.toLowerCase().equals("june")
				|| nameOfMonth.toLowerCase().equals("september") || nameOfMonth.toLowerCase().equals("november")) {
			System.out.println("Day of month is: 30 days");
		} else if (nameOfMonth.toLowerCase().equals("february")) {
			System.out.println("Day of month is: 28 or 29 days");
		} else {
			System.out.println("Day of month is: 31 days");
		}
	}
	// return largest number in a array
	public static void largestNumber(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("Max is:" + max);
	}
}
