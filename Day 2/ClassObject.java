class Calculator {
	public int add(int n1, int n2) {
		if(n1 == 0 && n2 == 0) {
			return 0;
		}
		int r = n1 + n2;
		return r;
	}
}

public class ClassObject {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		Calculator calc = new Calculator();
		int result = calc.add(4, 5);
		int result1 = calc.add(14, 15);
		// calc.add();
		// int result=calc.add();
		// int result=num1+num2;
		System.out.println(result);

	}
}
