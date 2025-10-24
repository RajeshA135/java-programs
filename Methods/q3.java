//3. Create Java Application where we have one class, it contains one non-static method like Display having parameter Boolean, it has to print the value of Boolean and it is going to return nothing then invoke this method under the main method. (Google.java)

class Example{
	void Display(boolean b){
	System.out.println(b);
	}	
	public static void main(String[] args){
	Example obj=new Example();
	obj.Display(true);
	}
}