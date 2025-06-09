import java.util.*;
class outerClass
{
	void outerMethod()
	{
	 class innerClass
	 {
	   	 void InnerMethod()
		 {
			 System.out.println("Inner Method");
		 }
	 }
      	 innerClass o=new innerClass();
		 o.InnerMethod();
	}
}

class localInnerClass
{
	public static void main(String[] args)
	{
		outerClass o1=new outerClass();
		o1.outerMethod();
	}
}