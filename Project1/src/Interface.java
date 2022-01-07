
public class Interface implements InterFac {

	public static void main(String[] args) {
		Interface inter=new Interface();
		int sum=inter.add(32,54);
		System.out.println(sum);
		double area=inter.areaOfCirlce(2);
		System.out.println("Area is: "+area);
	}

	@Override
	public int add(int n1, int n2) {
		
		return n1+n2;
	}

	@Override
	public int mul(int n1, int n2) {
		
		return n1*n2;
	}

	@Override
	public double areaOfCirlce(double radius) {
		
		return PI*radius*radius;
	}

}
