package self;

/*Write a program to analyze the Below Condition
if >100 Rupees He will Buy CatburySilk
if >70 and <100 he will buy Fruit Chocolate
if >50 and <70 he will buy Milk Chocolate
if <50 Print "Deepak Don't Want to go to Chocolate Shop"
*/


/*Price Of Catbury Silk is 112
 * Price of Fruit Chocolate is 78
 * Price of Milk Chocolate is 54
 */
//Using the Ternary Operator

public class Assignment7 {
	
	public int rupees;
	
	public Assignment7() 
	{
		
	}
	public Assignment7(int _rupees)
	{
		this.rupees = _rupees;
	}
	
	
	public String showResult() {
		
		/*
		 if(this.rupees >=100)
			return "CadburySilk";
		else if(this.rupees >= 70 && this.rupees <= 100)
			return "Fruit Chocolate";
		else if(this.rupees >=50 && this.rupees <-70)
			return "Milk Chocolate";
		else
			return "He Don't Want to go to Chocolate Shop";
		
		}
		
		*/
		
	return this.rupees >= 100 ? "CadburySilk" :this.rupees >= 70 && this.rupees <= 100 ? "Fruit Chocolate" :this.rupees >=50 && this.rupees <-70 ? "Milk Cholate":"He Don't Want to go to the Chololate Shop";
			
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Assignment6(40).showResult());
	}

}
