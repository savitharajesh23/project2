package abstracttopic;

abstract class tester1 {
	abstract void cool();

	abstract void test();
}

class Demo1 extends tester1 {
	void cool() {
		System.out.println("hello");
	}

	void test() {
		System.out.println("hi");
	}
}
	public class sample1 {
		public static void main(String[] args) {
			Demo1 d1 = new Demo1();
			d1.cool();
			d1.test();
		}
	}

