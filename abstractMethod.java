import java.util.*;
abstract class firstMain
{
	abstract void print();
	public void Innerfunction()
	{
		System.out.println("This msg from first method");
	}
}

class secondMain extends firstMain
{
	void print(){
		System.out.println("This msg from override Function");
	}
}

class abstractMethod
{
	public static void main(String[] args)
	{
		secondMain o=new secondMain();
		o.Innerfunction();
		o.print();
	}
}