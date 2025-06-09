import java.util.*;
class outerClass
{
  final int Value=34;
  final int Minimum,Maximum;

   outerClass(int a){
	   Minimum=a;
	   Maximum=10;
   }  
   
   void print(){
	    System.out.println("Value :"+Value);
	    System.out.println("Minimum :"+Minimum);
	    System.out.println("Maximum :"+Maximum);
   }
}

class finalKeyword
{
	public static void main(String[] args)
	{
		outerClass o=new outerClass(5);
		o.print();
		
	}
}