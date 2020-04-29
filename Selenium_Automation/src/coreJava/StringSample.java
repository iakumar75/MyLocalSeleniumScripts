package coreJava;

public class StringSample {
	public static void main(String[] args) {
		String abc;//string declaration and 
		abc = "Anand";// string assigned value
		System.out.println(abc);
		
		
		String a = "G";
		System.out.println(a);
		String name  = a+"."+abc;
		System.out.println(name);
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace('A', 'l'));
		
		String b = "Apple";
		String c = "apple";
		System.out.println("String length is:  "+b.length());
		if (b.equals(c)) {
			System.out.println("both are matching");
		} else {
			System.out.println("both are  NOT matching");
		}
		
		if (b.equalsIgnoreCase(c)) {
			System.out.println("both are matching********");
		} else {
			System.out.println("both are  NOT matching*********");
		}		
		
		
		String name1 = "Guntupalli Anand"; //Nan
		if (name1.contains("palli")) {
			System.out.println("it's contains****");
		} else {
			System.out.println("it's Notcontains****");
		}
		
		
		//Conversation String to int
		String d = "123";
		int e =456;
		
		System.out.println(d+e);//579   123456
		
		int f = Integer.parseInt(d);
		System.out.println(e+f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
