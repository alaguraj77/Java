import java.util.*;
class outer
{
	int a=30;
	int b=45;
	class inner
	{
		void innerMethod()
		{
			System.out.println("Inner Class :"+a);
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