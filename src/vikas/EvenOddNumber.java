package vikas;

public class EvenOddNumber {
	public static void main(String[] args) {
		
		//no % 2 == rem == 0 //Even Number else Odd Number
		int no = 24;
		int rem = no % 2;
		if(rem == 0) {
			System.out.println("Number:"+ no +" is Even");
		}
		else {
			System.out.println("Number:"+ no +" is Odd");
		}
	}

}
