import java.util.*;
abstract class main
{
	void voiceCall(){
		System.out.println("Voice is working");
	}
	abstract void  camara();
	abstract void  display();
}
class samsung extends main{
    void camara()
	{
	  System.out.println("Samsung Mobile-50Mp");	
	}
    void display(){
		System.out.println("Samsung Mobile-Amold Display");
	}
}
class nokia extends main{
	void camara(){
		System.out.println("nokia Mobile-12Mp");
	}
	void display(){
		System.out.println("Nokia Mobile-HD+ Display");
	}
}



class abstractMobileExample
{
	public static void main(String[] args)
	{
		samsung o1=new samsung();
		o1.voiceCall();
		o1.camara();
		o1.display();
		
		System.out.println("---------------------");
		
		nokia o2=new nokia();
		o2.voiceCall();
		o2.camara();
		o2.display();
		
		
		
		
		
		
	}
}