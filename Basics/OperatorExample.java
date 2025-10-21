public class OperatorExample{
    public static void main(String args[]){
        int a=3;
        int b=2;
        int c=4;
        b= b++ + (a*b) + a++ ;
        a = (b%4) + c++ + (3*c) -(++a);
        b= ++c + ((a+b) % c)+ b++ - ((a+b)/c);
        c= 25-a++ - b++ - ++c + (c%(a+b));
        System.out.println(a+" "+b+" "+c);
    }
}