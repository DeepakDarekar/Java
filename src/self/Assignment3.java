package self;

//Write a program for addition of first 2 numbers and Subtract that number from the Third Number

public class Assignment3 {
	
	int a,b,c;
			
	//Parameterless Constructor
	
	public Assignment3() {
		
	}	

	//Parameterized Constructor

	public Assignment3(int i, int j,int k) {

		this.a=i;
		this.b=j;
		this.c=k;
	
	}
	
	public int add() {
		
		return this.a+this.b;
	}
	
	public int sub(int n) {
		
		return this.c-n;
	}
						 
	public static void main(String[] args) {

		Assignment3 obj1 = new Assignment3(5,10,20);
				
		int addition = obj1.add();
		
		System.out.println(addition);
		
		addition = obj1.sub(addition);
		
		System.out.println(addition);
	}

}
