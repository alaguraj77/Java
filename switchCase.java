import java.util.Scanner;
class switchCase
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Addition No :");
		System.out.println("Enter the Subtraction No :");
		System.out.println("Enter the Multiplication No :");
		System.out.println("Enter the Division No :");
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		int a,b,c;
	    switch(ch){
			case 1:
			System.out.println("Enter your addition number");
			  a=in.nextInt();
			  b=in.nextInt();
		      c=a+b;
			System.out.println("Addition"+c);
			break;
			case 2:
			System.out.println("Enter your Subtraction number");
			  a=in.nextInt();
			  b=in.nextInt();
			  c=a-b;
			System.out.println("Addition"+c);
			break;
			case 3:
			System.out.println("Enter your Multiplication number");
			a=in.nextInt();
			  b=in.nextInt();
			c=a*b;
			System.out.println("Addition"+c);
			break;
			case 4:
			System.out.println("Enter your Division number");
			a=in.nextInt();
			  b=in.nextInt();
			 c=a/b;
			System.out.println("Addition"+c);
			break;
			default:
			System.out.println("invalid");
		}
	}
}