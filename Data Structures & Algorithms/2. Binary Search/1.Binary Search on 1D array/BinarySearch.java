// A real-life example of Binary Search:
// Problem statement: Assume there is a dictionary and we have to find the word “raj”.

// Method 1: One of the many ways is to check every possible page of the entire dictionary and see if we can find the word “raj”. This technique is known as linear search.
// Basically, we can traverse from the first till the end to find the target value in the search space i.e. the entire dictionary in our example.

// Method 2: In this case, we will optimize our search by using the property of a dictionary i.e. a dictionary is always in the sorted order.

// We will first try to open the dictionary in such a way that it is roughly divided into two parts. Then, we will check the left page. Now, assume the words on the left page starts with ‘s’. We can certainly say that our target word i.e. “raj” definitely comes before the words start with ‘s’. So, now, we need not search in the entire dictionary rather we will only search in the left half.
// Now, we will do the same thing with the left half. First, we will divide it into 2 halves and then try to locate which half contains the word “raj”. Eventually, after certain steps, we will end up finding the word “raj”.
// This is a typical real-life example of binary search. 

// Note:

// Binary search is only applicable in a sorted search space. The sorted search space does not necessarily have to be a sorted array. It can be anything but the search space must be sorted.
// In binary search, we generally divide the search space into two equal halves and then try to locate which half contains the target. According to that, we shrink the search space size.

//Iterative implementation:

import java.util.*;

public class tUf {

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
} 

//In the algorithm, in every step, we are basically dividing the search space into 2 equal halves. This is actually equivalent to dividing the size of the array by 2, every time. After a certain number of divisions, the size will reduce to such an extent that we will not be able to divide that anymore and the process will stop. The number of total divisions will be equal to the time complexity.
// Let’s derive the number of divisions mathematically,

// If a number n can be divided by 2 for x times:
// 	2^x = n
// Therefore, x = logn (base is 2)
// So the overall time complexity is O(logN), where N = size of the given array.

//Recursive implementation:

import java.util.*;

public class tUf {

    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1; //Base case.

        // Perform the steps:
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid])
            return binarySearch(nums, mid + 1, high, target);
        return binarySearch(nums, low, mid - 1, target);
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}

//In the algorithm, in every step, we are basically dividing the search space into 2 equal halves. This is actually equivalent to dividing the size of the array by 2, every time. After a certain number of divisions, the size will reduce to such an extent that we will not be able to divide that anymore and the process will stop. The number of total divisions will be equal to the time complexity.

// Let’s derive the number of divisions mathematically,

// If a number n can be divided by 2 for x times:
// 	2^x = n
// Therefore, x = logn (base is 2)
// So the overall time complexity is O(logN), where N = size of the given array.
