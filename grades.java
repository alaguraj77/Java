import java.util.Scanner;
class grades
{
    public static void main(String[] arg)
    {
		System.out.println("Enter the number :");
		Scanner in=new Scanner(System.in);
		int grades=in.nextInt();
		if(grades>=90&&grades<=99){
			System.out.println("Grade A");
		}
		else if(grades>=80&&grades<=89){
			System.out.println("Grade B");
		}
		else if(grades>=70&&grades<=79){
			System.out.println("Grade C");
		}
		else if(grades>=60&&grades<=69){
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade Z");
		}
    }
}