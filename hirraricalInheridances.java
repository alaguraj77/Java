import java.util.*;

class values
{
	int a,b;
}

class addtions extends values
{
	public void add(int m,int n)
	{
		a=m;
		b=n;
	}
	public int addResult(){
		int c=a+b;
		return c;
	}
}

class subtraction extends values
{
	public void sub(int m){
		a=m;
		b=5;
	}
	public int subResult()
	{
		return a-b;
	}
}


class multiplication extends values
{
	public void mul(int n)
	{
		a=3;
		b=n;
	}
	public int mulResult()
	{
		return a*b;
	}
}

class hirraricalInheridances
{
  public static void main(String[] args)
  {
	  //addtions
	  addtions o1=new addtions();
	  o1.add(5,5);
	  System.out.println("Addtions :"+o1.addResult());
	  
	  //Subtractions
	  subtraction o2=new subtraction();
	  o2.sub(2);
	  System.out.println("Subtractions :"+o2.subResult()); 
	  
	  //multiplications
	  multiplication o3=new multiplication();
	  o3.mul(4);
	   System.out.println("Multiplications :"+o3.mulResult());
	  
  }
}



