//27.	Create a Java Application where we have one class, it contains one static method m1 having parameter class variable and returns nothing, then invoke this method under main by providing dynamic inputs.
import java.util.Scanner;
class Example{
	Scanner sc = new Scanner(System.in);
	static Example e = new Example();
	int a = sc.nextInt();
	static void m1(){
		System.out.println(e.a);
	}
	public static void main(String[] args){
		e.m1();
		
	}
}