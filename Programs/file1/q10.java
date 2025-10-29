//10.	Write a program to print average of numbers given  in the range.

import java.util.Scanner;
class Example{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);	
	int start = sc.nextInt();
	int end = sc.nextInt();
	int sum=0;
	int c=0;

		for(int i=start; i<=end; i++){
		sum+=i;
		c++;
		
		}float avg = (float)sum/c;
		System.out.printf("%.2f",avg);
	}
}