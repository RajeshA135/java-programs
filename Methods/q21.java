//21.	Create a java application where we have one class it contains methods like M1 which does not have any parameter and returns nothing, method M2 which does not have any parameter and returns nothing then invoke M1 under M2 and then M2 under the main method, both M1 and M2 methods have to print any user-friendly message on the console (RRR.java)

import java.util.Scanner;
class Example{
	static Scanner sc = new	Scanner(System.in);
	void m1(){
		System.out.println(sc.nextLine());
		}
	void m2(){
		System.out.println(sc.nextLine());	
			m1();			
		}
	public static void main(String[] args){
		Example e = new Example();
		e.m2();
		
	}	
}