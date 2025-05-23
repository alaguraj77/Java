import java.util.Scanner;
class whileLoop{
	public static void main(String[] args)
	{
		System.out.println("Enter the number :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		while(i<=n){
			System.out.println("Result :"+i);
			i++;
		}
	}
}