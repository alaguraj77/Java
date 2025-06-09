import java.util.*;

class cons
{
	int a,b;
	
	cons(int x,int y)
	{
	  System.out.println("Constructor Called");
      a=x;
      b=y;	  
	}
	
	int mul()
	{
		int c=a*b;
		return c;
	}
}


class parameterizodConstructor
{
  public static void main(String[] args)
  {
	 cons o=new cons(3,9);
     System.out.println(o.mul());	 
  }
}