import java.util.Scanner;

public class SwapExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
	System.out.println("Before swapping: c = " + c + ", d = " + d);
        // Swap two numbers without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

	c=c+d-(d=c);
        System.out.println("After swapping: a = " + a + ", b = " + b);
	System.out.println("After swapping: c = " + c + ", d = " + d);
    }
}

