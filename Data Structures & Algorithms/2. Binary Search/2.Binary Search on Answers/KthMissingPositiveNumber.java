//Brute Force Approach:

import java.util.*;

public class KthMissingPositiveNumber {
    public static int missingK(int[] vec, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k) k++; //shifting k
            else break;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}

//Time Complexity: O(N), N = size of the given array. Reason: We are using a loop that traverses the entire given array in the worst case.
//Space Complexity: O(1) as we are not using any extra space to solve this problem.

//Optimal Approach(Using Binary Search): 

import java.util.*;

public class KthMissingPositiveNumber {
    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}

//Time Complexity: O(logN), N = size of the given array. Reason: We are using the simple binary search algorithm.
//Space Complexity: O(1) as we are not using any extra space to solve this problem.
