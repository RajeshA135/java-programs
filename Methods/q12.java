//12.	Create one java application where we have one class it contains one non-static method m1 having parameter character and it is going to a Boolean value, invoke this method under main by providing dynamic input. (abba.java)  

import java.util.Scanner;
class Example{
	boolean m1(char ch){
		return true;
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			char ch=sc.next().charAt(0);
			Example obj = new Example();
			System.out.print(obj.m1(ch));
			}
	}