package deepak;

import java.util.Scanner;

public class CalculatorTwo {

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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("You have Following Choices");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Exit");
		System.out.println("Please Enter the Choice");
		//scan.close();
		int no = scan.nextInt();
		int result = 0;
		switch (no) {
		case 1:
			result = addFunction(a, b);
			System.out.println("Addition =" + result);
			break;
		case 2:
			result = subFunction(a, b);
			System.out.println("Substraction =" + result);
			break;
		case 3:
			result = multiFunction(a, b);
			System.out.println("Multiplication =" + result);
			break;
		case 4:
			if (b == 0)// when denominator becomes zero
			{
				System.out.println("DIVISION NOT POSSIBLE");
				break;
			} else
				result = divFunction(a, b);
			System.out.println("Division =" + result);
			break;
		case 5:
			result = modulusFunction(a, b);
			System.out.println("modulus is " + result);
			break;
		case 6:
			System.out.println("Exit and Come Outside");
			break;

		default:
			System.out.println("You have Select the invalid Option");
			break;
		

		}

	}
}
