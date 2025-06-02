import java.util.Arrays;
class ArrayAscendingOrder
{
	public static void main(String[] args)
	{
		int[] a={2,56,3,19,40,156};
		System.out.println("Before Sorting :"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)//2 56
		{
			for(int j=i+1;j<a.length;j++)//56 3 19
			{
				if(a[i]>a[j])//2>56 56>3 56>19
				{
					int temp=a[i];
					a[i]=a[j];
 					a[j]=temp;
				}
			}
		}
		System.out.println("After Sorting :"+Arrays.toString(a));//2
		
	}
}