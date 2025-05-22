import java.util.Scanner;
class leapYear
{
  public static void main(String[] args)
  {
     System.out.println("Enter the number :");
	 Scanner in=new Scanner(System.in);
	 int year=in.nextInt();
	 if(year%4==0||(year%100==0&&year%400==0))
	 { 
		 System.out.println("Leap year"); 
	 }
	 else
	 {
		 System.out.println("It's not leapYear");
	 }
  }
}