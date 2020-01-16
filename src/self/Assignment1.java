	package self;
	
	//Wriote a Program to add first 3 numbers and from that 3 numbers use first 2 for Subtraction and multiplication

	public class Assignment1 {

		int P,Q,R;
	
		//Parameterless Constructor

		public Assignment1()
		{
	
		}

		//Parameterized Constructor

		public Assignment1(int i, int j, int k) {
	
			this.P=i;
			this.Q=j;
			this.R=k;

		}


		public int add() {
			return P+Q+R;
	
		}

		public int mult() {
			return P * Q;
    }
 
 		public int Sub()
		{
		return P - Q;
		}
 	 
		public static void main(String[] args) {
	
			Assignment1 obj1 = new Assignment1(10,20,30);
	
			int result = obj1.add();
				
			System.out.println(result);
				
			result = obj1.mult();
				
			System.out.println(result);
			
			result = obj1.Sub();
				
			System.out.println(result);
	
		}
		}

	
	
