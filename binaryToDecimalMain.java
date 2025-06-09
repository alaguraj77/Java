import java.util.Scanner;

class binaryToDecimal
{
  public int Decimal(int n)
  {
	  int decimal=0,power=0;//d=0 p=1,d=0 p=2,d=4 p=3
	  while(n!=0)//1100>0 110>0 11>0 1>0
	  {
		  int remainder=n%10;//0 0 1 1
		  decimal+=remainder*Math.pow(2,power);//0 0 4 8
		  n=n/10;//110 11 1
		  power++;
	  }
	  return decimal;
	  
  }	
}


class binaryToDecimalMain
{
  public static void main(String[] args)
  {
	 System.out.print("Enter your binary Number :");
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     binaryToDecimal o=new binaryToDecimal();
     o.Decimal(n);//1100
	 System.out.print(o.Decimal(n));
  }
}