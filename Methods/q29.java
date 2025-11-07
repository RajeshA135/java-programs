//Create a java application where we have a class it contains non static variables Boolean , int,char,    we //also have non static method m1 and static method m2, access all instance variables in m1& m2 //methods
//invoke m1, m2 under main method by providing dynamic methods.

import java.util.Scanner;
class Example{
Scanner sc = new Scanner(System.in);
static Example obj = new Example();
	boolean a=sc.nextBoolean();
	int b		= sc.nextInt();
	char c = sc.next().charAt(0);
	void m1(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	static void m2(){
		
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);}
	public static void main(String[] args){
		obj.m1();
		Example.m2();	//calling static method with class name
		}
	}