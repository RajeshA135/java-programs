//Create a Java Application where we have one non-static global variable, and invoke this variable under the main method.
class NonStaticExample{
	int a=5; // non static global variable
	public static void main(String[] args){
			NonStaticExample obj = new NonStaticExample();
		System.out.println(obj.a);
	}
}