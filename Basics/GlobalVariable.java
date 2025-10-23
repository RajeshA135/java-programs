//Create a Java Application where we have one class, it contains one class, it contains one global static variable, then invoke this variable under the main method.
class Global{
		static float pi=3.14f;  // Global Static variable
	public static void main(String[] args){
	float area;
	int radius=5;
		area=2*pi*radius;
	System.out.println("Area of the Circle is: "+area);
	}	
}