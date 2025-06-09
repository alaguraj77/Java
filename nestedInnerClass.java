import java.util.*;
class outer
{
	int a=20;
	class inner
	{
		int b=40;
		void innerMethod()
		{
			System.out.println("This message form inner class method");
		}
	}
	void outerMethod()
	{
		inner i=new inner();
		i.innerMethod();
		System.out.println("inner class method  :"+i.b);
	}
}
class nestedInnerClass
{
 public static void main(String[] args)
  {
	  outer o=new outer();
	  o.outerMethod();
	  
	  outer.inner o2=new outer().new inner();
	  o2.innerMethod();  
  }
}



