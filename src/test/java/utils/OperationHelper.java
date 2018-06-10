package utils;

/**
 * AUTHOR : Phuong.tt
 * UNIT : Su3 - Group 2
 * MODIFIED : Add item cal 
 * UPDATE DATE : 29-05-2018
 */
public class OperationHelper {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		String var1 = "20/80";
		String var2 = "20+       80";
		String var3 = "20          /       80";
		String var4 = "20vcxvvcxv          *       dfgfdf80";
		int numberOne = 20;
		int numberTwo = 80;
		String operator = "/";
		cal.calculate1(var1);
		cal.calculate2(var2);
		cal.calculate3(var3);
		cal.calculate4(var4);
		cal.calculate5(numberOne, operator, numberTwo);
		cal.plus();
		cal.sub();
		cal.devide();
		cal.multi();
		
/**
* AUTHOR : Phuong.tt
* UNIT : Su3 - Group 2
* MODIFIED : Return day of month and return largest number
* UPDATE DATE : 30-05-2018
*/
		// Below are exercise day 3
		DayOfMonth dom = new DayOfMonth();
		dom.countDay("April");
		// input array
		int[] a = { 31, 28, 30, 32 };
		dom.largestNumber(a);
		
		ReadFileApachePoi.readFile("Test_Read_Excel.xlsx");
	}
}
