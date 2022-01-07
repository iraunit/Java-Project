

public class InnerClasses {
	public int getValue() {
		return 1;
	}
	class prog2{
		 public int getValue() {
			return 2;
		}
		
		 class prog3{
			public int getValue() {
				return 3;
			}
		}
	}
	public static void main(String[] args) {
		InnerClasses object=new InnerClasses();
		System.out.println(object.getValue());
		
		prog2 objinner= object.new prog2();
		System.out.println(objinner.getValue());
		

	}

}
