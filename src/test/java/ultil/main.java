package ultil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1 = "20/80";
		String var2 = "20+       80";
		String var3 = "20          /       80";
		String var4 = "20vcxvvcxv          *       dfgfdf80";
		int numberOne = 20;
		int numberTwo = 80;
		String operator = "/";
		OperationHelper.calculator1(var1);
		OperationHelper.calculator2(var2);
		OperationHelper.calculator3(var3);
		OperationHelper.calculator4(var4);
		OperationHelper.calculator5(numberOne, operator,numberTwo);
		OperationHelper.calculator();
	}

}
