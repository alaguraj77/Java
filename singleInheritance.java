import java.util.*;

class father
{
	public void house(){
		System.out.println("This house is my father's house");
	}
}
class son extends father
{
	public void car()
	{
		System.out.println("This car is my car");
	}
}

class singleInheritance
{
public static void main(String[] args)
 {
   son o=new son();
   o.house();
   o.car();
 }
}