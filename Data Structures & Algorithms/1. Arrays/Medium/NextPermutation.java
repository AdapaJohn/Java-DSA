//Brute Force Approach (Solution 1):

//Step 1: Find all possible permutations of elements present and store them.
//Step 2: Search input from all possible permutations.
//Step 3: Print the next permutation present right after it.
//https://www.youtube.com/watch?v=f2ic2Rsc9pU&t=32s

// Time complexity of O(N!xN).
// space complexity of O(1).

//Using in-built function(Solution 2) : 
// It is in C++ langauge covert into java 

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int NextPermutation() {
    int arr[] = {1,3,2};
    
    next_permutation(arr,arr+3);//using in-built function of C++
    
    cout<<arr[0]<<" "<<arr[1]<<" "<<arr[2];
    
    return 0;
}

//Solution 3:

import java.util.*;

public class NextPermutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}

//Time Complexity: O(3N), where N = size of the given array
//Space Complexity: Since no extra storage is required. Thus, its space complexity is O(1).
