//15.	Create a java application where we have one class, it contains the methods like nonstatic method m1 having a parameter string and it is going to return a float value, static method m2 having a parameter character and it is going to return a boolean value, nonstatic method m3 having a parameter integer and it is going to return double value, static method m4 having parameter boolean and it is going to return an integer value. then invoke m1 under m2, m2 under m3, m3 under m4, m4 under the main method by providing dynamic inputs.  (gang.java) 

import java.util.Scanner;
class Example{
	static Scanner sc = new Scanner(System.in);
	static Example e=new Example();
	float m1(String s)
	{
		System.out.println(s);
		return sc.nextFloat();
		}
	static boolean m2(char ch){
	
		System.out.println(ch);
		System.out.println(e.m1(sc.next()));
		return sc.nextBoolean();
		
		}
	double m3(int a){

		System.out.println(a);
		System.out.println(m2(sc.next().charAt(0))); 
		return sc.nextDouble();
		
		}
	static int m4(boolean b){
		System.out.println(b);
		System.out.println(e.m3(sc.nextInt()));		// we need an object to call non static method in static method
		return sc.nextInt();
		
		}
	
	public static void main(String [] args){
			
			
			System.out.println(m4(sc.nextBoolean()));

	} 


}