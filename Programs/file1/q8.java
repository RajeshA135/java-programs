//8.	Write a program to print all numbers which are divisible by 11 from given range.

import java.util.Scanner;
class Example{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);	
	int start = sc.nextInt();
	int end = sc.nextInt();
System.out.println("numbers which are divisible by 11 from the range "+start+" to "+end);
		for(int i=start; i<=end; i++){
		
		if(i%11==0)System.out.println(i);

		}
		}
}