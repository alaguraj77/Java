import java.util.*;
class demo
{
  int m,n;
  demo(int a,int b)
  {
	  this.m=a;
	  this.n=b;
  }
  int largest()
  {
	  if (m>n){
		  return m;
	  }
	  else
	  {		  
		  return n;
	  }
  }
  void  print()
  {
	  int largest=largest();
	  System.out.println("Largest Number :"+largest);
  }
}

class nestedMethods
{
 public static void main(String[] args)
 {
	 demo o=new demo(23,45);
	 o.print();
 }
}


