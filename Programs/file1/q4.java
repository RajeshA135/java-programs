//4.	Write a java program that performs the following tasks.
//a.	Store a number in a variable
//b.	If value is not in range (100-1000) prints wrong number else follows the steps
//c.	Check even or odd
//d.	If even divide the number by 3 and print the remainder
//e.	If odd divide the number by 2 and print the remainder.

import java.util.Scanner;
class Example{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n>=100 && n<=1000){
			if(n%2==0){
				System.out.println(n%3);
				}
			else{System.out.println(n%2);}
			}
		else{
		System.out.println("Wrong Number");	
		}

}

}