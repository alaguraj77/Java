
import java.util.Scanner;

public class armsStrong {
    public static void main(String[] args)
    {
        System.out.println("Enter the 3 Digit number :");
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();//120
        int temp=number;

        int digit1,digit2,digit3;

        digit1=temp%10;//0
        temp=temp/10;//12

        digit2=temp%10;//2
        temp=temp/10;//1

        digit3=temp%10;//1
        temp=temp/10;//0

        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (number==result){
            System.out.println("The given number is ArmsStrong number");
        }
        else {
           System.out.println("The given number is not  ArmsStrong number"); 
        }
    }
}
