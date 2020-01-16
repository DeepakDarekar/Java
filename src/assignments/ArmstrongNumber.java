package assignments;
//Assignment 13: To Check the Armstrong Number
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no1 = 0,no2;
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		while (n > 0) {
			no2 = n % 10;
			n = n / 10;
			no1 = no1 + (no2 * no2 * no2);
		}
		if (temp == no1)
			System.out.println("Given Number is armstrong number");
		else
			System.out.println("Given Number is Not armstrong number");
		sc.close();
	}
}
