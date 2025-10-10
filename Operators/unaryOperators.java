public class unaryOperators {
    public static void main(String args[])
    {
        int a=2;
        //a++ --->Post Increment(Use and change)
        //++a --->Pre Increment(change and Use)
         //a-- --->Post Decrement(Use and change)
        //--a --->Pre Decrement(change and Use)
        int b=a++ + ++a + (20/a) + a--;
        int c= (a+b) + --b + a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
