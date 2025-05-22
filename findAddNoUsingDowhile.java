import java.util.Scanner;
class findAddNoUsingDowhile
{
 public static void main(String[] arg)
 {
	 System.out.println("Enter the limit :");
	 Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int i=1;
	 do{
		 System.out.println("Reslut:"+i);
		 i+=2;
	 }while(i<=n);
 }
}