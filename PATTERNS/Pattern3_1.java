public class Pattern3_1 {
    public static void main(String[] args) {
        int n = 5;
        pattern3(n);
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
