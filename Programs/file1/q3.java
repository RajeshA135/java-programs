//3.	Declare and initialize 3 three variable and print the biggest number.

import java.util.Scanner;
class Example{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		if(a>=b && a>=c){
 			System.out.println("a is big");
		}

		else if (b>=c){
 			System.out.println("b is big");
		}
		else{
			System.out.println ("c is big");
		}


}

}