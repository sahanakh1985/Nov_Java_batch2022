package day23;

class A {
	int i;

	A(int j) {
		int i = 10;
		this.i = j;
	}

	void print() {
		int i = 8;
		System.out.println(i);   //8
		System.out.println(this.i);   //123
	}

}

public class Demo3 {

	public static void main(String[] args) {
		A a1 = new A(123);
		System.out.println(a1.i);
		a1.print();

	}

}
