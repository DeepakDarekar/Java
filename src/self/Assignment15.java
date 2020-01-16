package self;

public class Assignment15 {
	public void desgin() {
		int i,j,k,l,m;	
		//Printing First Half Part
		
		for(i=1; i<=5; i++)	{
				for(j = 1; j <= i;j++) {
				System.out.print(j);
				}	
				for(k = i; k < 5; k++) {
				System.out.print(" ");	
				}
				for(l=i;l< 5;l++) {
				System.out.print(" ");
				}
				for (m = i; m >= 1; m--) {
				System.out.print(m);	
				}
				System.out.println();
		}
		
		//Print Second Half Part]
		
		for (i = 5; i >= 0; i--) {
			for (j = 1; j <= i; j++)
				System.out.print(j);
			for(l=i;l< 5;l++) 
				System.out.print("*");
			for (m = i; m >= 1; m--) 
				System.out.print(m);	
				System.out.println();
			}
			
		}
	
	public static void main(String[] args) {
		new Assignment15().desgin();

	}

	
}
