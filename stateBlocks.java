import java.util.*;
class outerBlock
{
	static
	{
		System.out.println("Outer Block-1");
	}
	static
	{
		System.out.println("Outer Block-2");
	}
}


class stateBlocks
{
	static{
		System.out.println("Main Block-1");
	}
	public static void main(String[] args)
	{
		outerBlock o=new outerBlock();
		System.out.println("Main");
	}
	static{
		System.out.println("Main Block-2");
	}
}