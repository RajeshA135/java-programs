//24.	Create a java application where we have one class it contains methods like M1 having a parameter string and has to return a Boolean value, static method M2 having parameter char and it has to return nothing, and nonstatic method M3 which does not have any parameter and it has to return int value, static method M4 having parameter double and it has to return string value then invoke M1 under M2, M2 under M3, M3 under M4 and then M4 under main by providing dynamic inputs. (Numb.java)

import java.util.Scanner;

class Example{
	static Scanner sc = new Scanner(System.in);
	static Example e = new Example();
	boolean m1(String s){
		System.out.println(s);
		return sc.nextBoolean();
	}
	static void m2(char ch){
		System.out.println(ch);
		System.out.println(e.m1(sc.next()));
	}
	int m3(){
		m2(sc.next().charAt(0));
		return sc.nextInt();
	}	
	static String m4(double d){
		System.out.println(d);
		System.out.println(e.m3());
		return sc.next();
	}
public static void main(String args[]){
		Example e = new Example();
		System.out.println(m4(sc.nextDouble()));
	
	}
}