package self;

//Write a program to take the Total count of Number of Persons visited to your house in a group of family

public class Assignment5 {
	
	private static int personCount = 0;
	
	private void addMembers(int members)
	{
		personCount += members;
		
	}
	
	private int totalCount() {
		
		return Assignment5.personCount;
		
	}
	
	public static void main(String[] args) {
		
	new Assignment5().addMembers(5);
	new Assignment5().addMembers(4);
	new Assignment5().addMembers(6);
	new Assignment5().addMembers(7);
	System.out.println(new Assignment5().totalCount());
	
	}

	}
