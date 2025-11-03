//26.	Create a Java Application where we have one class it contains one static method m1 having no parameters and returns a Class variable, nonstatic method m2 having a parameter boolean and returns nothing, then invoke both methods under the main by providing dynamic inputs and without creating an object or without using object reference directly.

import java.util.Scanner;
	class Example{
		static Scanner sc = new Scanner(System.in);
		static Example e = new Example();
		static int a=sc.nextInt();
		static int m1(){
		return a;
			}
		void m2(boolean b){
		System.out.println(b);
		}
		public static void main(String [] args){
			System.out.println(m1());
			e.m2(sc.nextBoolean());
		}
	}