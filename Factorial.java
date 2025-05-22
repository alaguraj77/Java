
import java.util.Scanner;

class Factorial
{
  public static void main(String[] args)
  {
    System.out.println("Enter the Number :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=1;
    for (int i=1;i<=5;i++) {
          f=f*i;  
    }
      System.out.println(f);
  }   
}
