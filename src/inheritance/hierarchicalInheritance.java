package inheritance;
class bird {
	void eat() {
		System.out.println("eating...");
	}
}

class Parrot extends bird {
	void fly() {
		System.out.println("Flying");
	}
}

class sparrow extends bird {
	void drink() {
		System.out.println("drinking..");
	}

}

class hierarchicalInheritance {
	public static void main(String[] args)  
    { 
		sparrow s = new sparrow();
		s.drink();
		s.eat();
		// s.Fly();//Is not allowed

	}
}