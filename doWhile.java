import java.util.Scanner;
class doWhile
{
 public static void main(String[] args)
 {
    System.out.println("Enter the number :");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int i=1;
	do{
	    System.out.println("Reslut :"+i);//1 2
		i++;//2 3
	}while(i<=n);
 }
}