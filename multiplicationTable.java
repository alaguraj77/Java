
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args)
    {
        System.out.println("Enter The your table");
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        System.out.println("Enter your Limit :");
        int n=in.nextInt();
        for (int i = 0; i <= n; i++) {
              System.out.println("Result"+t+"*"+i+"="+t*i);
        }
    }
}
