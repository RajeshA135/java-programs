//11.	Create a Java Application where we have one class, it contains methods like static m1 having parameter Boolean which is going to return a Boolean value. non-static method m2 having parameter character which is going to return character value. static method m3 having parameter double which is going to return a double value. non-static method m4 having parameter long which is going to return a long value. static method m5 having parameter float which is going to return float value non-static method m6 having parameter String which is going to return String value. then invoke all these methods under the main method by providing dynamic inputs. (Mixture.java)

import java.util.Scanner;
class Example{
	static boolean m1(boolean b){
		return b;
		}
	 char m2(char ch){
		return ch;
		}
	static double m3(double d){
		return d;

		}
	 long m4(long l){
		return l;
		}
	 static float m5(float f){
		return f;
		}
	 String m6(String s){
		return s;

		}

	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			Example obj = new Example();
			
			System.out.println(Example.m1(sc.nextBoolean()));
			System.out.println(obj.m2(sc.next().charAt(0)));
			System.out.println(Example.m3(sc.nextDouble()));
			System.out.println(obj.m4(sc.nextLong()));
			System.out.println(Example.m5(sc.nextFloat()));
			System.out.println(obj.m6(sc.next()));
			}
	}