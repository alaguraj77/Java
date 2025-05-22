
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        {
            System.out.println("Enter the your number");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int a=-1,b=1,c;
            for(int i=0;i<=n;i++){
               c=a+b;
               System.out.println("Result :"+c);
               a=b;
               b=c;
            }
        }
    }
}
