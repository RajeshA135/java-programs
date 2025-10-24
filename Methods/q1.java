//1. Create JAVA Application where we have one class, it contains one non-static method like Display, Which is going to return nothing and does not have any formal parameters, this method has to print any user-friendly message on the console while we invoke this method under the main method. (CallingMethod.java)

class CallingMethod{
	void Display(){
		System.out.println("This is a Non static method, It is invoked under main method");
	}
	public static void main(String[] args){
		CallingMethod	obj=new CallingMethod();
		obj.Display();
		}
	}