//5.	Declare & initialize a number. Check whether the number is in range 0-100 or not. If not in range print invalid input. Else – if the number is in range 91-100 then print Super Smart, 81-90 print Smart,71-80 print smart enough, 61-70 print just smart, 36-60 print no smart, 0-35 print dump.


import java.util.Scanner;
class Numbercheck{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter any number");
int a = sc.nextInt();


 if(a>=0 && a<=100){

if (a>=91 && a<=100){
System.out.println(" super smart ");
}

else if(a>=81 && a<=90){
System.out.println("smart ");
}

else if(a>=71 && a<=80){
System.out.println("smart enough");
}

else if(a>=61 && a<=70){
System.out.println("just smart");
}

else if(a>=36 && a<=60){
System.out.println(" no smart");
}

else if(a>=0 && a<=35){
System.out.println("dump");
}
}

else{
System.out.println("invaqlid input");
}
}
}