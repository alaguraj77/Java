import java.util.Scanner;
import java.util.Arrays;

class function_array{

  public int[] sendArray()
  {
    System.out.println("Enter your limit :");
    Scanner in=new Scanner(System.in);	
	int n=in.nextInt();
	int []a=new int[n];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the your values :");
		a[i]=in.nextInt();
	}
	Arrays.sort(a);
	
	return a;
  }
	
}


class returningArrayFromMethod
{
	public static void main(String[] args)
	{
		function_array o=new function_array();
		int []arr=o.sendArray();
		for(int element:arr)
		{
			System.out.println(element);
		}
		
	}
}














