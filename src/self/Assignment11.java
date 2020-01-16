package self;

//Patterns

public class Assignment11 {
	
	public void design() {
	
		for(int i=1; i<=5; i++)	{
			for(int j = i; j <= 4;j++) {				
			System.out.print("*");
		}
			for(int k = 1; k <= i; k++) {
			System.out.print(k);
		}
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		new Assignment11().design();
	}
}
