import java.util.*;

class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("sum is : " + c);
        scanner.close();
    }
}