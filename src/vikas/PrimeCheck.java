package vikas;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		boolean prime = true;
		System.out.println("Enter the number to Check prime or Not :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for (int i=2; i<num; i++) {
			if (num%i == 0) {
				prime=false;
			
			}
		}
		if (prime== true) {
			System.out.println("The Given Number is Prime Number");

		}
		else {
			System.out.println("The Given number is not prime number");
		}

	}
}