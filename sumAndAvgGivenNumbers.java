import java.util.Scanner;

public class sumAndAvgGivenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            int a = in.nextInt();
            sum += a;
        }

        int avg = sum / n; // Use double for precision

        System.out.println("Sum of Given Numbers: " + sum);
        System.out.println("Average of Given Numbers: " + avg);
    }
}
