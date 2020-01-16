package self;

public class Refactor {


	public int  multi(int x,int y,int z) {
				
	    return x*y*z;
	}
	
	public static void main(String[] args) {
		
		Refactor r1 = new Refactor();
		
		int multiply = r1.multi(2,3,5);
		
		System.out.println(multiply);
		
	}
}

