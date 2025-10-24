//4. Create a Java Application where we have one class, it contains a non-static method m1 having parameter String and returns nothing. A static method m2 having parameter integer and returns nothing. Both methods have to print the value of parameter. Then invoke both the methods under main method.

class Example{
	void m1(String s){
		System.out.println(s);
		}
	void m2(int a){
		System.out.println("age is: "+a);
		}
	public static void main(String[] args){
		Example obj = new Example();
		obj.m1("My name is Rajesh");
		obj.m2(23);
		}
	}