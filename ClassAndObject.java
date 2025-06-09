import java.util.*;

class add
{
	 int length,width;
	
	void setValue(int x,int y)
	{
		length=x;
		width=y;
	}
	
	int addtion(){
		
		return length+width;
	}
}

class ClassAndObject
{
   public static void main(String[] args)
   {
	 add o=new add();
     o.length=12;
     o.width=18;
     System.out.println(o.addtion());	

     o.setValue(20,20);
     System.out.println(o.addtion());	 
   }
}