

public class armsStrongGivenNo {
    public static void main(String[] args)
    {
        System.out.println("Enter your number :");
        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
       
        int digit1,digit2,digit3;
        for (int i = 100; i <=999; i++) {

        int temp=i;

        digit1=temp%10;//0
        temp=temp/10;//12

        digit2=temp%10;//2
        temp=temp/10;//1

        digit3=temp%10;//1
        temp=temp/10;//0
        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (i==result){
            System.out.println("The given number is ArmsStrong number"+i);
        }
        }
         
    }
}
