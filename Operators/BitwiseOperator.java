public class BitwiseOperator {
    public static void main(String args[]){
        //& bitwise AND, | bitwise OR, ^ bitwise XOR
        int a=10 & 8;// 1010 & 1000                     //  A   B   &   |   ^
        int b=10 | 8;//1010 | 1000                      //  0   0   0   0   0
        int c=10 ^ 8;//1010 ^ 1000                      //  0   1   0   1   1
        System.out.println(a);                          //  1   0   0   1   1
        System.out.println(b);                          //  1   1   1   1   0
        System.out.println(c);
    }
}
