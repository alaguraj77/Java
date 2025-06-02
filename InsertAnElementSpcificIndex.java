import java.util.Arrays;
class InsertAnElementSpcificIndex
{
	public static void main(String[] arg)
	{
		int[] a=new int[] {2,4,5,6,7,100};
		int index=2,number=55;
		for (int i=a.length-1;i>index;i--)
		{
		  a[i]=a[i-1];
		}
		a[index]=number;
		System.out.println(Arrays.toString(a));
		

	}
}