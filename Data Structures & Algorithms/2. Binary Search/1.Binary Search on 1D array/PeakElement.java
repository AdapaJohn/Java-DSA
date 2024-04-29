//Naive Approach: 

import java.util.*;

public class PeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of array.

        for (int i = 0; i < n; i++) {
            // Checking for the peak:
            if ((i == 0 || arr.get(i - 1) < arr.get(i))
                    && (i == n - 1 || arr.get(i) > arr.get(i + 1))) {
                return i;
            }
        }
        // Dummy return statement
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }
}

//Time Complexity: O(N), N = size of the given array. Reason: We are traversing the entire array.
//Space Complexity: O(1) as we are not using any extra space.

//Optimal Approach(Using Binary Search): 

import java.util.*;

public class PeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of array

        // Edge cases:
        if (n == 1) return 0;
        if (arr.get(0) > arr.get(1)) return 0;
        if (arr.get(n - 1) > arr.get(n - 2)) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the peak:
            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1))
                return mid;

            // If we are in the left:
            if (arr.get(mid) > arr.get(mid - 1)) low = mid + 1;

            // If we are in the right:
            // Or, arr[mid] is a common point:
            else high = mid - 1;
        }
        // Dummy return statement
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }
}

//Time Complexity: O(logN), N = size of the given array. Reason: We are basically using binary search to find the minimum.
//Space Complexity: O(1) Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).
