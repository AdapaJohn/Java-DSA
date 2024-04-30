//Naive Approach(Using linear search):

import java.util.*;

public class SquareRootOfNumber {
    public static int floorSqrt(int n) {
        int ans = 0;
        // linear search on the answer space
        for (long i = 1; i <= n; i++) {
            long val = i * i;
            if (val <= (long) n) {
                ans = (int) i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}

//Time Complexity: O(N), N = the given number. Reason: Since we are using linear search, we traverse the entire answer space.
//Space Complexity: O(1) as we are not using any extra space.

//First Approach(Using in-built sqrt() function): 

import java.util.*;
import java.lang.Math;

public class SquareRootOfNumber {
    public static int floorSqrt(int n) {
        int ans = (int) Math.sqrt(n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}

//Time Complexity: O(logN), N = size of the given array. Reason: We are basically using the Binary Search algorithm.
//Space Complexity: O(1) as we are not using any extra space.

//Optimal Approach(Using binary search): 

import java.util.*;

public class SquareRootOfNumber {
    public static int floorSqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}

//Time Complexity: O(logN), N = size of the given array. Reason: We are basically using the Binary Search algorithm.
//Space Complexity: O(1) as we are not using any extra space.
