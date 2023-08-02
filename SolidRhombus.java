public class SolidRhombus {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
