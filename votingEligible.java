import java.util.Scanner;
class votingEligible
{
  public static void main(String[] arg)
  {
	 int age;
	 System.out.println("Enter the number :");
	 Scanner in=new Scanner(System.in);
	 age=in.nextInt();
	 if(age>=18)
	  {
		   System.out.println("You are eligible for voting");
	  }
	  else
	  {
		  System.out.println("You are not eligible for voting");
	  }
  }
}