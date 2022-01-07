

public class abc {
	enum studentType {UG,PhD,PG};
	public static void main(String[] args) {
		studentType type=studentType.PhD;
		System.out.println("good");
		switch(type) {
		case UG:
		case PG:
			System.out.println("Choice is UG or PG");
			break;
		case PhD:
			System.out.println("No covered in PhD");
			break;
			default:
				System.out.println("Hello");
				break;
		}

	}

}
