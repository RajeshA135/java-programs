public class LogicalOperator{
    public static void main(String args[]){
        //&& logical AND, || logical OR, ! logical NOT
        int a=10;
        int b=20;
        System.out.println(!(a==b && a!=b || a>=b));//true

    }
}