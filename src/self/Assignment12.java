package self;

	public class Assignment12 {
		
		
		public void design() {
		int i,j,k,l;
			for(i=1; i<=5; i++)	{
				for(j = i; j <= 4;j++) {				
					System.out.print(" ");
				}
				for(k = 1; k <= i; k++) {
					System.out.print(k);
				}
				for(l=1;l<i;l++){
					System.out.print(l);
				}
				System.out.println();
			}
			
		}
		public static void main(String[] args) {
			new Assignment12().design();
		}
	}

