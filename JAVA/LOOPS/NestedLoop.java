package LOOPS;

public class NestedLoop {
    public static void main(String[] args) {
        // Nested For Loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i);
            }
            System.out.println(" ");
        }
        // Nested While Loop
        int i = 1, j = 1;
        while (i <= 3) {
            while (j <= 3) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println(" ");
            j = 1;
        }
        // Nested DoWhile Loop - Do as Separate
        int row = 1, column = 1;
        int x;
        do {
            x = 4;
            do {
                System.out.println(" ");
                x--;
            } while (x >= row);
            column = 1;
            do {
                System.out.print(column + " ");
                column++;
            } while (column <= 5);
            System.out.print(" ");
            row++;
        } while (row <= 5);
        // Nested While and For Loop
        int weeks = 2;
        int days = 7;
        int y = 1;
        while (y <= weeks) {
            System.out.println("Week: " + y);
            for (int k = 1; k <= days; ++k) {
                System.out.println("Days: " + k);
            }
            ++y;
        }
        //Nested For & For-Each Loop
        for (int l = 5; l >= 1; --l) {
            int arr[] = {1,2,3,4};
            for (int val : arr) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
