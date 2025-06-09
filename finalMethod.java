import java.util.*;
class first
{
   final void print(){
		System.out.println("Parent Method");
	}
}
class two extends first
{
	void print(){
		System.out.println("Child Method override");
	}
	
}
class finalMethod
{
	public static void main(String[] args)
	{
	two o=new two();
    o.print();	
	}
}