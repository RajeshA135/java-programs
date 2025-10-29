//1. Write a program to convert kg to g. (Input 5.6kg print in grams)
import java.util.Scanner;
class Example{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	float kgs=sc.nextFloat();
	int grams=(int)(1000*kgs);
	System.out.println("kgs in Grams: "+grams); 
	}
}