import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.InputMap;

//import com.sun.jdi.Value;

public class ClassTwo {
	
	enum studentType {UG, PG, PhD}; 
	
	public static void main(String args []) {
//		studentType type1= studentType.PG;
//		studentType type2= studentType.UG;
//		studentType type3= studentType.PhD;
//		if(type1.equals(type2)) {
//			System.out.println("Both Students belong to same branch");
//		}
//		else {
//			System.out.println("Both Student belong to Different Branch");
//		}
//		System.out.println("This is the test Stri\bng");
//		System.out.println("This is the r string\r hello world");
		
		int value=21;
		int twiceValue=value<<2;
		System.out.println(twiceValue);
		Scanner sc= new Scanner(System.in);
		
		
		
		//byte data type
//		System.out.println("Enter Byte Data: ");
//		byte  a=sc.nextByte();
//		Byte hello=new Byte(a);
//		System.out.println("The value of the Byte is : "+hello);
//		char ch=sc.next().charAt(0);
//		Character charobhCharacter=ch;
//		System.out.println("The char is :"+ch);
//		
//		int num=4,fact=2;
//		int k=num;
//		do {
//			fact=fact*k;
//			k--;
//			System.out.println("Just chekcing");
//		}
//		while(k>0) ;
//			System.out.println("Factorial of is is "+fact);
//	for (int i = 0; i <10; i++) {
//		System.out.println("Ehllo");
//	}
//	for(int i=1; i<=15; i++) {
//		if(i%2!=0) {
//			continue;
//		}
//		if(i>10) {
//			break;
//		}
//		System.out.println(i);
//		}
//		int month=9;
//		String season;
//		switch (month) {
//		case 12:
//		case 1:
//		case 2:
//			season="Winter";
//			break;
//		case 3:
//		case 4:
//		case 5:
//			season="Spring";
//			break;
//		case 6:
//		case 7:
//		case 8:
//			season="Summer";
//			break;
//		default:
//			season="Bogus Month";
//			break;
//		}
//		System.out.println(season);
//		
//		int choice=5;
//		switch(choice) {
//		case 1:
//			System.out.println("Choice is 1");
//			break;
//		
//		default:
//			System.out.println("Not covered in cases");
//			break;
//		}
//		
//		Employee e1=new Employee();
//		e1.setEmpDepartment("Computer Science");
//		System.out.println("The department name is: "+ e1.getEmpDepartment());
//		
		
	}

}
