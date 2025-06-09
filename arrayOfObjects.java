import java.util.*;

class students
{
	int rollno;
	String studentName;
	
	students(String a,int b){
		this.studentName=a;
		this.rollno=b;
	}
	void print()
	{
		System.out.println("Student Name:"+studentName);
		System.out.println("Roll No :"+rollno);
		System.out.println("-----------------------");
		
	}
	
}

class arrayOfObjects
{
	public static void main(String[] args)
	{
		students [] o;
		o=new students[5];
		o[0]=new students("Raja",001);
		o[1]=new students("Yogi",002);
		o[2]=new students("Gokul",003);
		o[3]=new students("rohit",004);
		o[4]=new students("morish",003);
		
		for (int i=0;i<o.length;i++)
		{
		  o[i].print();	
		}
	}
}



