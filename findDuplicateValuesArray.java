import java.util.Scanner;
class findDuplicateValuesArray
{
  public static void main(String[] args)
  {
	  int[] a={2,3,3,4,6,7,2,10};
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++){
			  if(a[i]==a[j])
			  {
				  System.out.println("Duplicate Values"+a[j]);
			  }
		  }
	  }
  }
}