
public class staticClass {
	
	static int i=10;
	static int twiceI;
	
	static {
		twiceI=2*i;
		System.out.println("Inside Static Block!!!");
	}
	public static void printAnything() {
		System.out.println("Inside Static Method");
	}
	public static void main(String[] args) {
		System.out.println("The Value of i is: "+i);
		System.out.println("The value of twiceI is "+ twiceI);
		staticClass helooClass=new staticClass();
		helooClass.printAnything();
		staticClass.printAnything();

	}

}
