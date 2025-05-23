import java.util.Scanner;
class perfectNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number :");
		Scanner in=new Scanner(System.in);
	    int n,sum;
        n=in.nextInt();
        //temp=n;
		sum=0;//1 3 6
		for(int i=1;i<n;i++)//2<6 3<6 4<6
		{
			if(n%i==0){//2%6=0 3%6=0 4%6=2
			  sum+=i;//1+2=3 3+3=6
			}	
		}
		if(sum==n){
			System.out.println("The given number is perfect number :");
		}
		else 
		{
		  System.out.println("The given number is not perfect number :");	
		}
        	
	}
}