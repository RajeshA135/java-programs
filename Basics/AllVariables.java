// Create a Java Application where we have one class, it contains one local variable, one global static variable, and a non-static global variable then invoke all the variables under the main method.

class AllVariables{
	static int a=10; //global static variable
		int b=20; //global Non Static variable
	public static void main(String[] args){
			int c=30;	 //Local Variable
			AllVariables obj= new AllVariables();
		System.out.println("Global Static variable: "+AllVariables.a); // Accessing Global static variable using class name
		System.out.println("Global Non Static variable: "+obj.b);
		System.out.println("Local variable: "+c);
		
		}
	}