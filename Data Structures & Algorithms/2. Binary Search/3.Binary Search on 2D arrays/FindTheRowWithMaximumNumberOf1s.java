//Brute Force Approach:

import java.util.*;

public class tUf {
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        // traverse the matrix:
        for (int i = 0; i < n; i++) {
            int cnt_ones = 0;
            for (int j = 0; j < m; j++) {
                cnt_ones += matrix.get(i).get(j);
            }
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +
                           rowWithMax1s(matrix, n, m));
    }
}

//Time Complexity: O(n X m), where n = given row number, m = given column number. Reason: We are using nested loops running for n and m times respectively.
//Space Complexity: O(1) as we are not using any extra space.

//Optimal Approach:

import java.util.*;

public class tUf {
    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        // traverse the rows:
        for (int i = 0; i < n; i++) {
            // get the number of 1's:
            int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +
                           rowWithMax1s(matrix, n, m));
    }
}

//Time Complexity: O(n X logm), where n = given row number, m = given column number. Reason: We are using a loop running for n times to traverse the rows. Then we are applying binary search on each row with m columns.
//Space Complexity: O(1) as we are not using any extra space.
