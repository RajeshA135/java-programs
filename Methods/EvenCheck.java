import java.util.Scanner;
class Example{
	static boolean isEven(int c){
		if(c%2==0){
			return true;
			}
		else{return false;}
	}
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(Example.isEven(a));
	}
}