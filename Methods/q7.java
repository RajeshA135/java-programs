
//7. Create Java Application where we have one class it contains one non-static method m1 having parameters float and string, it has to print both values and it returns nothing, one static method m2 having parameters Boolean and long, has to print both values and it returns nothing, one non-static method m3 having parameters character and integer, it has to print both values and it returns nothing then invoke all these methods under the main by providing dynamic inputs(Mixed.java)


import java.util.Scanner;
class Example{
	void m1(float f, String s){
		System.out.println(f);
		System.out.println(s);
		}
	static void m2(boolean b, long l){
		System.out.println(b);
		System.out.println(l);
		}
	void m3(char ch, int a){
		System.out.println(ch);
		System.out.println(a);

		}
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			float f = sc.nextFloat();
			String s= sc.next();
			boolean b = sc.nextBoolean();
			long l= sc.nextLong();
			char ch= sc.next().charAt(0);
			int a=sc.nextInt();
			
			Example obj = new Example();
			obj.m1(f,s);
			Example.m2(b,l);
			obj.m3(ch,a);
			}
	}