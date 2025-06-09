import java.util.*;
class vararrays
{
	public static void getNames(String ...names)
	{
	  System.out.println(names[0]);
      System.out.println(names[1]);
      System.out.println(names[2]);	  
	}
	
	public static void main(String[] args)
	{
		getNames("Raja","yogi","dheena");
	}
}