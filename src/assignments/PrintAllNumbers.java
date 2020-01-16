package assignments;
//Assignment 4:Print All the Numbers from 1 to 50  
public class PrintAllNumbers {
	public static void main(String[] args) {
		for (int num1 = 1; num1 <= 50; num1++) {

			{
				if (num1 % 3 == 0) {
					System.out.print("abc" + ",");
				} else if (num1 % 5 == 0) {
					System.out.print("def" + ",");
				}else if (num1 % 10 == 0) {
					System.out.print("abcdef" + ",");
				}else {
					System.out.print(num1 + ", ");
				}

			}
		}
	}
}
