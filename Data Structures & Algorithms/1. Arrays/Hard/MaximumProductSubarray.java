//Brute Force Approach:

import java.util.*;
public class MaximumProductSubarray
{
	static int maxProductSubArray(int arr[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length-1;i++) 
	        for(int j=i+1;j<arr.length;j++) {
	            int prod = 1;
	            for(int k=i;k<=j;k++) 
	                prod *= arr[k];
	            result = Math.max(result,prod);
	        }
	   return result;     
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}

//Time Complexity: O(N3) Reason: We are using 3 nested loops for finding all possible subarrays and their product.
//Space Complexity: O(1) Reason: No extra data structure was used

//Better Approach:

import java.util.*;
public class MaximumProductSubarray
{
	static int maxProductSubArray(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}

//Time Complexity: O(N2) Reason: We are using two nested loops
//Space Complexity: O(1) Reason: No extra data structures are used for computation

//Optimal Approach 1:

import java.util.*;

public class MaximumProductSubarray {
    public static int maxProductSubArray(int[] arr) {
        int n = arr.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}

//Time Complexity: O(N), N = size of the given array. Reason: We are using a single loop that runs for N times.
//Space Complexity: O(1) as No extra data structures are used for computation.

//Optimal Approach 2:

import java.util.*;
public class MaximumProductSubarray
{
	static int maxProductSubArray(int arr[]) {
    int prod1 = arr[0],prod2 = arr[0],result = arr[0];
    
    for(int i=1;i<arr.length;i++) {
        int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
        prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
        prod1 = temp;
        
        result = Math.max(result,prod1);
    }
    
    return result;
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}

//Time Complexity: O(N) Reason: A single iteration is used.
//Space Complexity: O(1) Reason: No extra data structure is used for computation
