package self;

//Write a program to Select the Menu Card of the Hotel 

import java.util.Scanner;
public class Assignment10 {

	static int choice;
	static Scanner sc;
	
	private void menu(){
		
		System.out.println("Hello Good morning what you want");		
		System.out.println("1. Veg Maratha");
		System.out.println("2. Special Veg");
		System.out.println("3. Veg Kolhapuri");
		System.out.println("4. Veg Biryani");
		System.out.println("5. Exit");
		System.out.println("Please Enter the Choices");
	
	
	do{		
			
			if(choice==1) System.out.println("Veg Maratha is Orderd");
			else if(choice==2) System.out.println("Special Veg is Ordered");
			else if(choice==3) System.out.println("Veg Kolhapuri is Ordered");
			else if(choice==4) System.out.println("Veg Biryani is Orderd");
			else if(choice!=0) System.out.println("Invalid Option We can not serve this Food");
			sc=new Scanner(System.in);
			choice = sc.nextInt();
						
		}while(choice!=0);
		System.out.println("Thanks for Visiting");
		
	}

	public static void main(String[] args) {
		Assignment10 obj1=new Assignment10();		
		obj1.menu();
		//sc = new Scanner(System.in);
		//choice = sc.nextInt();
			
	}

}