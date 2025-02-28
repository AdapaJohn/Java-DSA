//Solution 1: Brute force approach

import java.util.*;
 public class ImplementPow{
 public static double myPow(double x, int n) {
        double ans = 1.0;
        for(int i = 0; i<n; i++){
            ans = ans * x;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(myPow(2,10));
    }
 }

//Time Complexity: O(N)
//Space Complexity: O(1)

//Solution 2: Using Binary Exponentiation

import java.util.*;
 public class ImplementPow{
 public static double myPow(double x, int n) {
    double ans = 1.0;
    long nn = n;
    if (nn < 0) nn = -1 * nn;
    while (nn > 0) {
      if (nn % 2 == 1) {
        ans = ans * x;
        nn = nn - 1;
      } else {
        x = x * x;
        nn = nn / 2;
      }
    }
    if (n < 0) ans = (double)(1.0) / (double)(ans);
    return ans;
  }

    public static void main(String args[])
    {
        System.out.println(myPow(2,10));
    }
 }

//Time Complexity: O(log n)
//Space Complexity: O(1)
