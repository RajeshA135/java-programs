//10. Create a Java Application where we have one class, it contains one non-static method m1 with parameter int and returns a Boolean value, and a static method m2 with parameter float and returns a character value, then invoke both the methods under the main method by providing dynamic inputs.

import java.util.Scanner;
class Example{
	boolean m1(int i){
		return true;
		}
	static char m2(float f){
		return 'A';
		}
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			Example obj = new Example();


			System.out.println(obj.m1(sc.nextInt()));
			System.out.println(Example.m2( sc.nextFloat()));
			
			}
	}