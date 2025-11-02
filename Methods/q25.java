//25.	create java app where we have one class, it contains nonstatic method m2 having parameter string and it is going to return a boolean value, static method m3 having parameter integer and it is going to return char value then invoke m2 under m3 and then m3 under the main method by providing dynamic inputs without using the import keyword. (perfect.java)


class Example{
	static java.util.Scanner sc= new java.util.Scanner(System.in);
	boolean m2(String s){
	System.out.println(s);
	return sc.nextBoolean();
	}
	char m3(int a){
	System.out.println(a);
	System.out.println(m2(sc.next()));
	return sc.next().charAt(0);
	}
	public static void main(String[] args){
		Example e = new Example();
		System.out.println(e.m3(sc.nextInt()));
		}
}