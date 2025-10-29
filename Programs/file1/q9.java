//9.	Write a program to sum all the numbers from the given Range.

import java.util.Scanner;
class Example{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);	
	int start = sc.nextInt();
	int end = sc.nextInt();
	int sum=0;

		for(int i=start; i<=end; i++){
		sum+=i;
		}
		System.out.println("sum of numbers from the range "+start+" to "+end+" : "+sum);;
	}
}