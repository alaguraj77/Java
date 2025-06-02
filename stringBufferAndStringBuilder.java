import java.util.*;
class stringBufferAndStringBuilder
{
	public static void main(String[] args)
	{
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println(buffer);
		buffer.append(" World");
		System.out.println(buffer);
		buffer.insert(11," Welcome");
		System.out.println(buffer);
		buffer.replace(6,10,"@@@@@");
		System.out.println(buffer);
	}
}