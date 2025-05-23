import java.util.Scanner;
class strongNumber
{
  public static void main(String[] args)
   {
      System.out.println("Enter your number :");
      Scanner in=new Scanner(System.in);
      int n,sum=0;
      n=in.nextInt();
      int temp=n;
	  while(temp>0)
	  {
		int rem=temp%10;
	    int fact=1;
		for(int i=1;i<=rem;i++){

			fact=fact*i;
		}
        sum=sum+fact;		
		temp=temp/10;
	  }
	  if(sum==n)
	  { 
       System.out.println("The given number is strong number");
      }
	  else
	  {
		 System.out.println("The given number is not a strong number") ;
	  }
	 
	  
	  
   }
}