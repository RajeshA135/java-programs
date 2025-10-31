//19.	Create a java application where we have one class it contains methods like M1 having a parameter string and it is going to return a Boolean value, method M2 has a parameter float and it is going to return nothing then invoke method M1 under M2 and then M2 under the main method by providing dynamic inputs. (Nylon.java)

import java.util.Scanner;
class Example{
	static Scanner sc = new	Scanner(System.in);
	boolean m1(String s){
		System.out.println(s);
		return sc.nextBoolean();
		}
	void m2(float f){
		System.out.println(f);
		System.out.println(m1(sc.next()));
		}
	public static void main(String[] args){
		Example e = new Example();
		e.m2(sc.nextFloat());
		
}	
}