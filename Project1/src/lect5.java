
public class lect5 {
		static int a=3;
		static int b;
		static void meth(int x) {
			System.out.println("I am raunit verma"+a);
			System.out.println("I am raunit verma"+b);
			System.out.println("I am raunit verma");
		}
	static {
		System.out.println("Static Block initialized");
		b=2;a=34;
	}
	public static void main(String[] args) {
		System.out.println("Inside main function");
		meth(34);

	}
	static {
		System.out.println("Inside static 2");
	}

}
