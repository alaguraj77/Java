import java.util.Scanner;
class drivingInsurance
{
 public static void main(String[] args)
 {
	 System.out.println("Enter the value M||U :");
	 Scanner in =new Scanner(System.in);
	 char married=in.next().charAt(0);
	 if(married=='u'||married=='U')
	 {
		 System.out.println("Enter your gender :");
         char gender=in.next().charAt(0);
		 System.out.println("Enter your age :");
		 int age=in.nextInt();
		 if((gender=='m'||gender=='M')&&age>=30){
			 System.out.println("You are eligible for insurance");
		 }
		 else if((gender=='f'||gender=='F')&&age>=25){
			 System.out.println("You are eligible for insurance");
		 }
		 else
		 {
			 System.out.println("You are not eligible for insurance");
		 }
	 }
	 else if(married=='m'||married=='M')
	 {
		 System.out.println("You are eligible for insurance");
	 }
	   else
	    {
		 System.out.println("invalid Entries");
	     }
 }
}