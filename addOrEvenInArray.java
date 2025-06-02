import java.util.Scanner;
class addOrEvenInArray
{
  public static void main(String[] args)
  {
	  System.out.println("Enter your limit :");
	  Scanner in=new Scanner(System.in);
	  int add=0,even=0;
	  int n=in.nextInt();
	  for(int i=1;i<=n;i++){
		  System.out.println("Enter the number"+i+" :");
		  int x=in.nextInt();
		  if(i%2==0){
			  even++;
			   //System.out.println("even Numbers"+i); 
		  }
		  else{
			  add++;
			  //System.out.println("add Numbers"+i); 
		  }
	  }
	  System.out.println("even Numbers"+even);
	  System.out.println("add Numbers"+add);
  }
}