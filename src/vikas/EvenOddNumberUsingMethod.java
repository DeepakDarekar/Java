package vikas;

public class EvenOddNumberUsingMethod {
	public static void main(String[] args) {
		checkEvenOdd(20);
			}

	public static void checkEvenOdd(int no) {
		
		int rem = no % 2;
		if (rem == 0) {
			System.out.println("The number is Even Number:" + no);
		} else {
			System.out.println("The number is Odd Number:" + no);

	}

}
}
