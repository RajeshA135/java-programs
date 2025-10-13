public class ternaryOperator {
    public static void main(String args[]){
        // condition? true block : false block

        int a=10;
        int b=20;
        String s=a>b? "a is big":a==b?"a & b are Equal":"b is big";
        System.out.println(s);
        //biggest of three numbers
        int x=100;
        int y=1000;
        int z=10;
        String s1=x>y?(x>z?"x is big":"z is big")
                     :(y>z?"y is big":"z is big");
        System.out.println(s1);

    }


}
