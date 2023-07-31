import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Sum of first " + n + " natual number is: " + sum);
        sc.close();
    }
}
