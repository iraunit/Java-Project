import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

public class JavaAssignment {

	public static void main() {
		Scanner s = new Scanner(System.in);
		//byte data type
		System.out.println("Enter byte data: ");
		byte a=s.nextByte();
		
		//wrapping around Byte object
		Byte byteobj= new Byte(a);
		
		//byte data type
				System.out.println("Enter int data: ");
				int b=s.nextInt();
				
				//wrapping around Int object
				Integer intobj= new Integer(b);
				
				//float data type
				System.out.println("Enter float data: ");
				float c=s.nextFloat();
				
				//wrapping around float object
				Float floatobj= new Float(c);
				
				//double data type
				System.out.println("Enter double data: ");
				double d=s.nextDouble();
				
				//wrapping around double object
				Double doubleobj= new Double(d);
	
				//char data type
				System.out.println("Enter char data: ");
				char e=s.next().charAt(0);
				
				//wrapping around Byte object
				Character charobj= new Character(e);
				
				//printing the values from objects
				
				System.out.println("Values of Wrapper objects");
				System.out.println("Byte Object: "+byteobj);
				System.out.println("Integer Object: "+intobj);
				System.out.println("Float Object: "+floatobj);
				System.out.println("Double Object: "+doubleobj);
				System.out.println("Character Object: "+charobj);
				
	}
	

}
