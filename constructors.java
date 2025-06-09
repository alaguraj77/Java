import java.util.*;

class cons
{
	 int a,b;
	 
	 cons(){
		 System.out.println("constructor Called");
		 a=2;
		 b=9;
	 }
	
	 int sub(){
		 int c=a-b;
		 return c;
	 }
}


class constructors
{
	public static void main(String[] args)
	{
		cons o=new cons();
		System.out.println(o.sub());
	}
}