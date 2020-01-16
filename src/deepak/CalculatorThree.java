package deepak;

import java.util.Scanner;

public class CalculatorThree {

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
		int result = 0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("ENTER FIRST NUMBER ");
			int a = scan.nextInt();
			System.out.println("ENTER SECOND NUMBER ");
			int b = scan.nextInt();
			System.out.println("You have Following Choices");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println("6.Exit");
			System.out.println("Please Enter the Choices");
			//scan.close();
			int no = scan.nextInt();
			switch (no) {
			case 1:
				result = addFunction(a, b);
				System.out.println("The Addition of two Numbers is =" + result);
				break;
			case 2:
				result =subFunction(a, b);
				System.out.println("The Substraction of two numbers is =" + result);
				break;
			case 3:
				result = multiFunction(a, b);
				System.out.println("The Multiplication of two Numbers is =" + result);
				break;
			case 4:
				if (b == 0)// when denominator becomes zero
				{
					System.out.println("DIVISION NOT POSSIBLE");
					break;
				} else
					result = divFunction(a, b);
				System.out.println("The Division of two Numbers is =" + result);
				break;
			case 5:
				result = modulusFunction(a, b);
				System.out.println("The modulus of two Numbers is =" + result);
				break;
			case 6:
				System.out.println("Exit and Come Outside");
				break;

			//default:
				//System.out.println("You have Select the invalid Option");
			}
		} while (result!=0);
		System.out.println("You have select the invalid Option");
	}
}
