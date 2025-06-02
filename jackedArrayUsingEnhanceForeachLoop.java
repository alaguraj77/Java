import java.util.Scanner;
class jackedArrayUsingEnhanceForeachLoop
{
	public static void main(String[] args)
	{
		int[][] a={
		  {10,20,30,40},
			  {50,60,70},
				  {80,90,100,110}
	    };
		for(int k[]:a)
		{
			for (int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println(" ");
		}
	}
}