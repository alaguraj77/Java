import java.util.*;

class Methods{
	
	  int a=2,b=4;
	  //Without return withoutArgument
	  public void add(){
        System.out.println("Addtion: "+(a+b));
	  }
	  //with return withoutArgument
	  public int sub(){
		  return a-b;
	  }
	  //No return with Argument
	  public void mul(int c,int d)
	  {
		  System.out.println("Multiplication "+(c*d));
	  }
	  //Witrh return with Argument
	  public int div(int c,int d)
	  {
		  return c/d; 
	  }
}

class userDefinedFunctions
{
   public static void main(String[] args)
   {
	    Methods o=new Methods();
        o.add();
        System.out.println("Subtraction :"+o.sub());
		o.mul(5,5);
		System.out.println("Division :"+o.div(10,5));
		

 		
   }   
}