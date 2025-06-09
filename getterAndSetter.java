import java.util.*;

class getSet
{
	private int length,width;
	
	int getLength(){
		return length;
	}
	void setLength(int l){
		length=l;
	}
	int getWidth(){
		return width;
	}
	void setWidth(int l)
	{
		width=l;
	}
	int area()
	{
		int c=length*width;
		return c;
	}
	
}
class getterAndSetter
{
	public static void main(String[] args)
	{
		getSet o=new getSet();
		o.setLength(20);
		o.setWidth(20);
		System.out.println("Length :"+o.getLength());
		System.out.println("Width :"+o.getWidth());
		System.out.println("area :"+o.area());
		
	}
}