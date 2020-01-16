package assignments;
//Assignment 12:To check the Factorial Number 
import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number for ypu want Factorial");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Number is " + fact);
		sc.close();
	}
}
