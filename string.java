import java.util.Scanner;
class string
{
	public static void main(String[] args)
	{
		String a="Hello World";
		String b="hello World";
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		System.out.println("Hash Code "+a.hashCode());
		System.out.println("Hash Code "+b.hashCode());
		System.out.println("Equals with Case Sensetive "+a.equals(b));
		System.out.println("Equals without Case Sensitive "+a.equalsIgnoreCase(b));
		System.out.println("charAt "+a.charAt(2));
		System.out.println("To UpperCase "+a.toUpperCase());
		System.out.println("To LowerCase "+a.toLowerCase());
		System.out.println("Replace "+a.replace("World","Welcome"));
		System.out.println("Contains "+a.contains("el"));
		System.out.println("Start with "+a.startsWith("He"));
		System.out.println("Ends with "+a.endsWith("ld"));
		System.out.println("subString "+a.substring(4));
		System.out.println("subString "+a.substring(1,5));
		
		char[] d=a.toCharArray();
		for(char c:d)
		{
		System.out.println(c);	
		}
		
		
	}
}