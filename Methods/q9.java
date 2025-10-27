//9.  Create Java Application where we have one class, it contains one static method like m2, having parameter String and it is going to return String value then invoke this method under main by providing dynamic input (W.java)

import java.util.Scanner;
class Example{
	static  String  m2(String s){
		return s;
		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			String s=sc.next();
			System.out.print(Example.m2(s));
			}
	}