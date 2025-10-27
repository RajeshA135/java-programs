//13.	Create a java application where we have one class it contains one non-static method m1 having the parameter String and is going to return an integer value, and a static method m2 having the parameter Boolean and it is going to return a float value, a non-static method m3 having parameter character and it is going to return a double value, then invoke all these methods under the main by providing dynamic inputs for both parameters and return types. (Blah.java)

import java.util.Scanner;
class Example {
	int m1(String s){
		return 5;
	}
	static float m2(boolean b){
		return 3.14f;
	}
	double m3(char ch){
		return 56342.3423;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		boolean b = sc.nextBoolean();
		char ch= sc.next().charAt(0);
		

		Example obj= new Example();
		System.out.println(obj.m1(s));
		System.out.println(m2(b));
		System.out.println(obj.m3(ch));
	}
}