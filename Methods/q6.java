//6. Create a java application where we have one class, it contains a non-static method m1 having parameter float and returns nothing. A static method m2 having parameter integer returns nothing. A non-static method m3 having parameter Boolean returns nothing. Then invoke all these methods under main by providing dynamic inputs.

import java.util.Scanner;
class Example{
	void m1(float f){
		System.out.println(f);
		}
	static void m2(int a){
		System.out.println(a);
		}
	void m3(boolean b){
		System.out.println(b);
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			float f = sc.nextFloat();
			int a=sc.nextInt();
			boolean b = sc.nextBoolean();
			Example obj = new Example();
			obj.m1(f);
			Example.m2(a); // static method accessing with class
			obj.m3(b);
			}
	}