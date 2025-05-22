import java.util.Scanner;
class findEvenNumbersForLoop
{
  public static void main(String[] args)
  {
      System.out.println("Enter the Limit :");
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  for(int i=0;i<=n;i+=2)
	  {
		   System.out.println("Result :"+i); 
	  }
  }
}