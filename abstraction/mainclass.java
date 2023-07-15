package abstraction;

interface animal {
	void noise();
}

class Cat implements animal {
	public void noise() {
		System.out.println("meow meow");
	}
}

class Dog implements animal {
	public void noise() {
		System.out.println("boww boww");
	}
}

class Snake implements animal {
	public void noise() {
		System.out.println("buss buss");
	}
}

class stimulator {
	static void ansim(animal a1) {
		a1.noise();
	}
}

public class mainclass {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		Snake s1 = new Snake();
		
		stimulator.ansim(c1);
		stimulator.ansim(d1);
		stimulator.ansim(s1);

	}
}
