import java.util.*;
class main
{
	public void vedio(){
		System.out.println("Vedio");
	}
	public void display(){
		System.out.println("Display");
	}
}

interface a{
	void redmi();
	void apple();
}
interface b{
    void samsung();
	void pixel();
}


class mobile extends main implements a,b{
	public void camara(){
		System.out.println("camara");
	}
	public void temper(){
		System.out.println("temper");
	}
	public void redmi(){
		System.out.println("redmi");
	}
	public void apple(){
		System.out.println("apple");
	}
	public void samsung(){
		System.out.println("samsung");
	}
	public void pixel(){
		System.out.println("pixel");
	}
	
}



class multipleInheritance
{
	public static void main(String[] args)
	{
		mobile o=new mobile();
		o.vedio();
		o.display();
		o.redmi();
		o.apple();
		o.samsung();
		o.pixel();
		o.camara();
		o.temper();
		
	}
}
