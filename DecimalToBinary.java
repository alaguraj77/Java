import java.util.Scanner;

class binary
{
	public void decimal(int n)
	{
		int []binaryToDecimal=new int[1000];
		int i=0;
		while(n>0)
		{
		  binaryToDecimal[i]=n%2;
          n=n/2;
          i++;		  
		}
		
		System.out.println("Binary No :");
		
		for (int j=i-1;j>=0;j--)
		{
			System.out.print(binaryToDecimal[j]);
		}
		
	}
}



class DecimalToBinary
{
	public static void main(String[] args)
	{
	   System.out.println("Enter the the Binary Number :");
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       binary o=new binary();
       o.decimal(n);	   
	}
}