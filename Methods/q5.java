//5. Create a java application where we have one class it contains one non-static method display having a parameter integer, it has to print the value of an integer. and which is going to return nothing then invoke this method under the main method by providing dynamic input (R.java)

import java.util.Scanner;
class Example{
	void Display(int a){
		System.out.println(a);
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			Example obj = new Example();
			obj.Display(a);
			}
	}