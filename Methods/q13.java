//13.	Create a java application where we have one class it contains one non-static method m1 having the parameter String and is going to return an integer value, and a static method m2 having the parameter Boolean and it is going to return a float value, a non-static method m3 having parameter character and it is going to return a double value, then invoke all these methods under the main by providing dynamic inputs for both parameters and return types. (Blah.java)

import java.util.Scanner;
class Example {
			Scanner sc = new Scanner(System.in);
	int m1(String s){
		System.out.println(s);
		return sc.nextInt();
	}
	static float m2(boolean b){
		Scanner sc = new Scanner(System.in); //Static method can't access above scanner class
		System.out.println(b);
		return sc.nextFloat();
	}
	double m3(char ch){
		System.out.println(ch);
		return sc.nextDouble();
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Example obj= new Example();

		System.out.println(obj.m1(sc.next()));
		System.out.println(m2(sc.nextBoolean()));
		System.out.println(obj.m3(sc.next().charAt(0)));
	}
}	