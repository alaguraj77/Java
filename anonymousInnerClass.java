import java.util.*;
abstract class outerClass
{
  abstract void outerMethod();
}
class innerClass
{
	public void innerMethod(){
		outerClass o=new outerClass()
		{
			void outerMethod()
			{
				System.out.println("Outer Method");
			}
		};
		o.outerMethod();
	}
}
class anonymousInnerClass
{
	public static void main(String[] args)
	{
		innerClass o=new innerClass();
		o.innerMethod();
	}
}