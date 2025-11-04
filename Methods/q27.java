//27.	Create a Java Application where we have one class, it contains one static method m1 having parameter class variable and returns nothing, then invoke this method under main by providing dynamic inputs.
import java.util.Scanner;
class Example{

	static void m1(Example a){
		System.out.println(a);
	}
	public static void main(String[] args){
		Example.m1(new Example());
		
	}
}