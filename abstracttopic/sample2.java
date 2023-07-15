package abstracttopic;

abstract class tester2 {
	abstract void cool();

	abstract void test();
}

abstract class Demo2 extends tester2 {
	void cool() {
		System.out.println("i am cool");
	}
}

class tester3 extends Demo2 {

	void test() {
		System.out.println("hello");
	}
}

public class sample2 {
	public static void main(String[] args) {
		tester3 t1 = new tester3();
		t1.cool();
		t1.test();
	}
}

