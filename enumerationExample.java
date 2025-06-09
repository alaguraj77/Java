import java.util.*;
class enumerationExample
{
	enum GameLevel
	{
		 High,
		 Medium,
		 Low
	}
	
	
	public static void main(String[] args)
	{
		GameLevel o=GameLevel.High;
		System.out.println(o);
		
		switch(o){
			case High:
		    System.out.println("High Level");
			break;
			case Medium:
		    System.out.println("Medium Level");
			break;
			case Low:
		    System.out.println("Low Level");
			break;
			default:
			System.out.println("Default");
		}
	}
}