package self;

public class Assignment13 {

		int i,j,k,l,m;	
		public void design() {
		
			for(i=1; i<=5; i++)	{
				for(int j = 1; j <= i;j++) {
					
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
		}

		public static void main(String[] args) {
			new Assignment13().design();
			
	}
}


	
