import java.util.Scanner;
class gettingInputs
{
	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter the number :");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		System.out.println("Reslut :"+c);
	}
}