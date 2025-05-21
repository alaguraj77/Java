import java.util.Scanner;
class findVowels
{
  public static void main(String[] args)
  {
    System.out.println("Enter the letter :");
	Scanner hh=new Scanner(System.in);
    char x=hh.next().charAt(0);
    switch (x){
		  case 'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u':
		  case 'A':
		  case 'E':
		  case 'I':
		  case 'O':
		  case 'U':
		  System.out.println("It's vowel");
		  break;
		  default:
		  System.out.println("It's not a vowel");
	}	
  }
}