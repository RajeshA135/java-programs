//6.	Write a program to perform simple math based on the user inputs by using Switch condition.(+ , - , * , /)

import java.util.Scanner;
class Example{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int ch =sc.next().charAt(0);
		int a= sc.nextInt();
		int b= sc.nextInt();
	switch(ch){
		case		'+'	: System.out.println("a+b="+(a+b));
							break;
		case		'-'	: System.out.println("a-b="+(a-b));
							break;
		case		'*'	: System.out.println("a*b="+(a*b));
							break;
		case		'/'	: System.out.println("a/b="+(a/b));
							break;
		default		: System.out.println("Wrong input");
							break;

		}
}
}