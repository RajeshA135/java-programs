//17.	create a java application where we have one class, it contains methods like add having two parameters as integers, it is going returns the value as the addition of two formal parameters, method sub having two parameters as integers and it is going to return the value as subtraction of two parameters, method multi which doesn't have any parameters and it has to return the value as multiplication of both ‘add’ and ‘sub’ method results. then invoke multi under the main method by providing input values dynamically. (P.java)

import java.util.Scanner;
class Example{
	Scanner sc= new Scanner(System.in);
	int add(int num1, int num2){
		return num1+num2;
		}
	int sub(int num1, int num2){
		return num1-num2;
		}
	int multi(){
		return add(sc.nextInt(),sc.nextInt()) * sub(sc.nextInt(),sc.nextInt());
		}
	public static void main(String args[]){
			Example e =  new Example();
		System.out.println("Addition of  two numbers * Subtraction of two numbers is:  "+e.multi());
		}
	}