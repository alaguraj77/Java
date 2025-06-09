import java.util.*;
class user
{
	int age;
	String city;
	user(int a,String b)
	{
		this.age=a;
		this.city=b;
	}
	
	void print()
	{
		System.out.println("My age is :"+age+"| City :"+city);
	}
	
}
class name extends user
{
	String names;
	
	name(int a,String b,String c)
	{
		super(a,b);
		this.names=c;
	}
	
	@Override
	void print()
	{
		 System.out.println("My name is :"+names);
		 System.out.println("My age is :"+age);
		 System.out.println("My city is :"+city);
		 
	}
}	

class methodOverriding
{
	public static void main(String[] args)
	{
		user o=new user(23,"madurai");
		o.print();
		
		
		 name n = new name(25, "Chennai", "Arun");
        n.print();
	}
}