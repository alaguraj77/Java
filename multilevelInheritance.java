import java.util.*;

class grandFather{
	public void Ghouse(){
	 System.out.println("Grand Father's house");	
	}
}
class Father extends grandFather{
 public void Fhouse()
 { 
	 System.out.println("Father's House"); 
 }
}
class son extends Father
{
	public void Shouse()
	{
		System.out.println("Son's house");
	}
}

class multilevelInheritance
{
	public static void main(String[] args)
	{
		 son o=new son();
		 o.Ghouse();
		 o.Fhouse();
		 o.Shouse();
	}
}