import java.util.*;
class outer{
	static int a=20;
	int b=30;
	void show(){
			System.out.println("a :"+a+"b :"+b);
	}
	static void display(){
		System.out.println("a :"+a);
	}
}




class staticVariablesAndMethods
{
	public static void main(String[] args)
	{
		outer o1=new outer();
		o1.show();
		
		o1.a=30;
		o1.show();
		o1.display();
		
		
	}
}