//8. Create Java Application where we have one class it contains one non-static method m1 having a parameter integer and it is going to return an integer value and then, invoke this method under the main method by providing dynamic input. ( Integral.java)

import java.util.Scanner;
class Example{
	int Display(int a){
		return a;
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			Example obj = new Example();
			System.out.print(obj.Display(a));
			}
	}