
import java.util.Scanner;

public class primeNotPrime {
    public static void main(String[] args)
    {
        System.out.println("Enter your Limit :");
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int f=0;
        for (int i = 1; i <=n; i++) {   
              if (n%i==0) {
                  f++;
              }     
        }
        if(f==2){
                 System.out.println(n+"Prime Numbers");
              }
              else{
                System.out.println(n+"Not a Prime Numbers");
              }
         
       
    }
}
