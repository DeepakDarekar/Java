package self;

import java.util.Scanner;

//Write a program to print java number of times as the use gives input during run time

public class Assignment8 {
		
public void display (int count) {

		while(count> 0)
		{
			System.out.println("java");			
			count--;
		}
}
			
	
	public static void main(String[] args) {
		
		Assignment8 obj1 = new Assignment8();		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter count to display - ");
	    int count = sc.nextInt();
	    obj1.display(count);
		sc.close();

	}
}

	
