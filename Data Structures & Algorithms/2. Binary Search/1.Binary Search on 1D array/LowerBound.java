//The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.

//Naive approach (Using linear search): 

import java.util.*;

public class LowerBound {

    public static int lowerBound(int []arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}

//Time Complexity: O(N), where N = size of the given array.Reason: In the worst case, we have to travel the whole array. This is basically the time complexity of the linear search algorithm.
//Space Complexity: O(1) as we are using no extra space.

//Optimal Approach (Using Binary Search): 

import java.util.*;

public class LowerBound {

    public static int lowerBound(int []arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
} 

//Time Complexity: O(logN), where N = size of the given array.Reason: We are basically using the Binary Search algorithm.
//Space Complexity: O(1) as we are using no extra space.
