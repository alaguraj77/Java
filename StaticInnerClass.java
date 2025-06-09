import java.util.*;
class outer
{
	static int a=30;
	int b=45;
	static class inner
	{
		void innerMethod()
		{
			System.out.println("a :"+a+"b :"+b);
			
			
		}
	
	}
}


class StaticInnerClass
{
	public static void main(String[] args)
	{
		outer.inner o=new outer().new inner();
		o.innerMethod();
	}
}