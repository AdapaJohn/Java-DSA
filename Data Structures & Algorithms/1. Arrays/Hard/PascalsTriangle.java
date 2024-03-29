//Problem Statement: This problem has 3 variations. They are stated below:

//Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
//Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
//Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.

//Variation 1(Optimal):

import java.util.*;

public class PascalsTriangle {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }
} 

//Time Complexity: O(c), where c = given column number.Reason: We are running a loop for r times, where r is c-1.
//Space Complexity: O(1) as we are not using any extra space.

//Variation 2(Naive Approach):

import java.util.*;

public class PascalsTriangle {

    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}

//Time Complexity: O(n*r), where n is the given row number, and r is the column index which can vary from 0 to n-1.Reason: We are calculating the element for each column. Now, there are total n columns, and for each column, the calculation of the element takes O(r) time where r is the column index.
//Space Complexity: O(1) as we are not using any extra space.

//Variation 2(Optimal Approach):

import java.util.*;

public class PascalsTriangle {

    static void pascalTriangle(int n) {
        long ans = 1;
        System.out.print(ans + " "); // printing 1st element

        // Printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}

//Time Complexity: O(N) where N = given row number. Here we are using only a single loop.
//Space Complexity: O(1) as we not using any extra space.

//Variation 3(Naive Approach):

import java.util.*;

public class PascalsTriangle {
    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(n*n*r) ~ O(n3), where n = number of rows, and r = column index.Reason: The row loop will run for approximately n times. And generating a row using the naive approach of variation 2 takes O(n*r) time complexity.
//Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can be still considered as O(1).

//Variation 3(Optimal Approach):

import java.util.*;

public class PascalsTriangle {
    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(n2), where n = number of rows(given).Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.
//Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).
