
public class StringClass {
	static int abc;
	public static void main(String...args) {
		String a="HEk";
		a="cout";
		System.out.println(a);
		char data[]= {'a','c','d'};
		String str=new String(data);
		System.out.println(str.toUpperCase());
		StringBuffer buffer=new StringBuffer("This is ");
		System.out.println("Buffer Capacity is: "+buffer.capacity());
		buffer=buffer.append("Hello there");
		buffer=buffer.reverse();
		String subbuffer=buffer.substring(0, 5);
		System.out.println(subbuffer);
		System.out.println(buffer);
		abc=324;
		System.out.println(abc);
		
		StringBuilder builder=new StringBuilder("This is string builder");
		System.out.println("Capacity of builder os"+builder.capacity());
		String nullStr=null;
		String emptyStr="";
		System.out.println(emptyStr.length());
		nullStr="hello";
		System.out.println(nullStr.length());
		
}
}
