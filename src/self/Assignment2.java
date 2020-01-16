package self;

//Write a program to addition of 2 Numbers without using Constructor and No business login in main Method

public class Assignment2 {
	
	//Addition Method
	
public int add(int a,int b) {
		
			return a+b;
	}

	public static void main(String[] args) {
		
		Assignment2 obj1 = new Assignment2();
		int addition = obj1.add(100,200);
		System.out.println(addition);

	}
}