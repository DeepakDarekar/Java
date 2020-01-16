package deepak;

import java.util.Scanner;

public class Calculator {

	public static int addFunction(int num1, int num2) {
		return num1 + num2;
	}

	public static int subFunction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiFunction(int num1, int num2) {
		return num1 * num2;
	}

	public static int divFunction(int num1, int num2) {
		return num1 / num2;
	}

	public static int modulusFunction(int num1, int no2) {
		return num1 % no2;
	}

	public static void main(String[] args) {

		System.out.println("Enter two integer to calculate there Sum");
		Scanner scan = new Scanner(System.in);
		int no1 = scan.nextInt();
		int no2 = scan.nextInt();
		int sum = addFunction(no1, no2);
		System.out.println("Addition of Two Numbers = " + sum);

		int sub = subFunction(no1, no2);
		System.out.println("Substraction of Two Numbers = " + sub);

		int multi = multiFunction(no1, no2);
		System.out.println("Multiplication of Two Numbers = " + multi);

		int div = divFunction(no1, no2);
		System.out.println("Division of Two Numbers = " + div);

		int modulus = modulusFunction(no1, no2);
		System.out.println("Modulus of  of Two Numbers = " + modulus);
		scan.close();
	}

}
