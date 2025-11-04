//26.	Create a Java Application where we have one class it contains one static method m1 having no parameters and returns a Class variable, nonstatic method m2 having a parameter boolean and returns nothing, then invoke both methods under the main by providing dynamic inputs and without creating an object or without using object reference directly.nn

import java.util.Scanner;
	class Example{
		static Scanner sc = new Scanner(System.in);

		static Example m1(){
		return new Example();
			}
		void m2(boolean b){
		System.out.println(b);
		}
		public static void main(String [] args){
			
			m1().m2(sc.nextBoolean());
		}
	}