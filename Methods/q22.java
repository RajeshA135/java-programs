//22.	Create a java application where we have one class it contains methods like M1 having parameter string and it is going returns nothing, method M2 having parameter Boolean and it is going returns nothing then invoke method M1 under M2 and then invoke method M2 under the main method by providing dynamic inputs. (Pushpa.java)

import java.util.Scanner;

class Example{
	static Scanner sc = new Scanner(System.in);
	void m1(String s){
		System.out.println(s);

	}
	void m2(Boolean b){
		System.out.println(b);
		m1(sc.next());
	}
	public static void main(String args[]){
		Example e = new Example();
		e.m2(sc.nextBoolean());
	
	}
}