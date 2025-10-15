public class elseIfLadder{
    public static void main(String args[]){
        //biggest of three numbers
        int num1=10, num2=30, num3=20;
        if(num1==num2 && num2==num3) {
            System.out.println("All Numbers are Equal..");
        }
        else if(num1>num2 && num1>num3) {
            System.out.println("Num1 is Biggest: " + num1);
        }
        else if(num2>num3){
            System.out.println("Num2 is biggest: "+num2);
        }
        else System.out.println("Num 3 is Biggest: "+num3);
    }
}