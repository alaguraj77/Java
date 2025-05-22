
import java.util.Scanner;

public class factor {
    public static void main(String[] args)
    {
        System.out.println("Enter your number :");
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();//5
        for (int i = 1; i <=n; i++) {
              if (n%i==0) {
                    System.out.println(i+" ");
              }  
        } 
    }
}
