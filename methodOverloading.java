import java.util.*;

class overloading
{
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public double multiply(double a,double b)
	{
		return a-b;
	}
	public float multiply(float a,float b)
	{
		return a+b;
	}
}
class methodOverloading
{
public static void main(String[] args)
  {
      overloading o=new overloading();
	  System.out.println("Multiply :"+o.multiply(23,45));
	  System.out.println("Double :"+o.multiply(3.4,7));
	  System.out.println("Float :"+o.multiply(3.6,9));
  }
}