package self;
//Print the Pattern of the Numbers with Space
public class Assignment14 {		
		public void design() {
		int i, j, k;
		//Upper Part
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5 - i; j++)
			System.out.print(" ");
			for (k = 1; k <= i; k++)
			System.out.print(k + " ");
			System.out.println();
			
			}	//Lower Part
		
			for (i = 1; i <= 4; i++) {
				for(j=1;j<=i;j++)
				System.out.print(" ");
				for (k = 1; k<= 5 -i;k++)
				System.out.print(k + " ");
				System.out.println();
			}
			
		}
	
		public static void main(String[] args) {
			new Assignment14().design();
		}
	}


