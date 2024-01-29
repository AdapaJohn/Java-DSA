package LOOPS;

public class Do_WhileLoop {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i < 2) {
            System.out.println("while: " + i);
            i++;
        }
        do {
            System.out.println("do: " + j);
            j++;
        } while (i < 2);
    }
}
