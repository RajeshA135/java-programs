import java.util.*;
import java.io.*;
public class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	boolean b= sc.nextBoolean();
	byte b1=sc.nextByte();
	short s=sc.nextShort();
        int a=sc.nextInt();
	long l=sc.nextLong();
	float f=sc.nextFloat();
	double d= sc.nextDouble();
	String s1=sc.next();	

	
System.out.println("Character form User Input: "+ch);
System.out.println("Boolean value form User Input: "+b);
System.out.println("Byte value form User Input: "+b1);
System.out.println("Short value fromUser Input: "+s);
System.out.println("Int value from User Input: "+a);
System.out.println("Long value from User Input: "+l);
System.out.println("Float value from User Input: "+f);
System.out.println("Double value from User Input: "+d);
System.out.println("String value fromUser Input: "+s1);

    }
}