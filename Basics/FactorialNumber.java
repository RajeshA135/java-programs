import java.util.Scanner;

public class FactorialNumber{
    public static void main(String args[]){
        int fact=1;
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0 || n==1 || n==2){
            System.out.println("Factorial of a number is:"+n);
        }
        else {
            for(int i=1;i<=n;i++){
                fact=i*fact;

            }System.out.println("Factorial of a number is:"+fact);
        }
    }
}