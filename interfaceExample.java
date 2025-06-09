import java.util.*;
interface main{
	void dog();
	void sound();
}
class subfn implements main{
	public void dog(){
		System.out.println("Native Dog");
	}
	public void sound()
	{
		System.out.println("Bow bow");
	}
}



class interfaceExample
{
	public static void main(String[] args)
	{
		subfn o=new subfn();
		o.dog();
		o.sound();
	}
}