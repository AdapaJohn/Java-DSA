public class FibanaccioSeies {
    public static void main(String[] args) {
        int n = 30, first = 0, second = 1, next;

        System.out.println("Fibanaccio series of " + n + "terms are :");
        while (first<=n) {    //up to a given number
            
        // }
        // for (int i = 1; i <= n; i++) {
            System.out.print(first + " ,");
            next = first + second;
            first = second;
            second = next;

        }

    }
}
