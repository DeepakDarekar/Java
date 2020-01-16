package self;

//Write a program in which collection collection variable is restricted to have values from Jan to Dec.

public class Assignment4 {
		
		enum Month
		
		{
		  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
		  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
		}
		
		 Month MonthTypes;
		
		public static void main(String[] args) {

			Assignment4 obj1 = new Assignment4();
								
			obj1.MonthTypes =  Month.JANUARY;
		
			System.out.println(obj1.MonthTypes);
					
		}
	}
