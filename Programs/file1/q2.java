//2.	Write a program to covert temperature from degree C to F. (Input 80C)		(80°C × 9/5) + 32 = 176°F

import java.util.Scanner;
class Example{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float C = sc.nextFloat();
	float fh	=(C*9/5)+32;
	System.out.printf("%.2fF",fh);
	
	}
}