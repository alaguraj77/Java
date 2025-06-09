import java.util.*;
interface interDemo
{
	 final int a=20;
	 public abstract void fun1();
	 public abstract void fun2();
	
	public static void fun4(){
		System.out.println("Function 4");
	}
}

interface inter1 extends interDemo{
   public void fun3();
}


class inter2 implements inter1{
	public void fun1(){
		System.out.println("Function 1");
	}
	public void fun2(){
		System.out.println("Function 2");
	}
	public void fun3(){
		System.out.println("Function 3");
	}
}

class interDemo2
{
	public static void main(String[] args)
	{
	   System.out.println(interDemo.a);
       inter2 o=new inter2();
	   o.fun1();
	   o.fun2();
	   o.fun3();
	  
	  interDemo.fun4();
      	   
	}
}







