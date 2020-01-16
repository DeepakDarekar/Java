package inheritance;

class WildAnimal {
	void eat() {
		System.out.println("eating...");
	}
}

class lion extends WildAnimal {
	void bark() {
		System.out.println("barking...");
	}
}

class Babylion extends lion {
	void weep() {
		System.out.println("weeping...");
	}
}

class multipleInheritance {
	public static void main(String args[]) {
		Babylion l = new Babylion();
		l.weep();
		l.bark();
		l.eat();
	}
}