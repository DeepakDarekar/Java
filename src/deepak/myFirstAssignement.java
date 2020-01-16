package deepak;

public class myFirstAssignement {

	public static int addFunction(int num1, int num2) {
		return num1 + num2;
	}

	public static double subFunction(double num1, double num2) {
		return num1 - num2;
	}

	public static int multiFunction(int num1, int num2) {
		return num1 * num2;
	}

	public static double divFunction(double num1, double num2) {
		return num1 / num2;
	}

	public static int modulusFunction(int num1, int no2) {
		return num1 % no2;
	}

	public static void main(String[] args) {
		int sum = addFunction(20, 30);
		double sub = subFunction(20, 30);
		int multi = multiFunction(20, 30);
		double div = divFunction(20, 30);
		int modulus = modulusFunction(16,3);
		System.out.println("Addition of Two Numbers = " + sum);
		System.out.println("Substraction of Two Numbers = " + sub);
		System.out.println("Multiplication of two Numbers = " + multi);
		System.out.println("Division of two Numbers = " + div);
		System.out.println("Modulus of Two Numbers = " + modulus);
	}

}
