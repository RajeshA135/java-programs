//12.	Create one java application where we have one class it contains one non-static method m1 having parameter character and it is going to a Boolean value, invoke this method under main by providing dynamic input. (abba.java)  

import java.util.Scanner;
class Example{
		Scanner sc= new Scanner(System.in);
	boolean m1(char ch){
		System.out.println(ch);
		return sc.nextBoolean();
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			Example obj = new Example();
			System.out.println(obj.m1(sc.next().charAt(0)));
			}
	}