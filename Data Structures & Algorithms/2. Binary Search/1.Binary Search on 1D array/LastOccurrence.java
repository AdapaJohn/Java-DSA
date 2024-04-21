//Solution 1: Naive solution 

public class LastOccurrence {
  public static int solve(int n, int key, int[] v) {
    int res = -1;
    for (int i = n - 1; i >= 0; i--) {
      if (v[i] == key) {
        res = i;
        break;
      }
    }
    return res;
  }
  public static void main(String args[]) {
    int n = 7;
    int key = 13;
    int[] v = {3,4,13,13,13,20,40};

    // returning the last occurrence index if the element is present otherwise -1
    System.out.println(solve(n, key, v));
  }
}

//Time Complexity: O(n) 
//Space Complexity: O(1) not considering the given array

//Solution 2: Binary search solution (optimised) 

public class LastOccurrence {
  public static int solve(int n, int key, int[] v) {
    int start = 0;
    int end = n - 1;
    int res = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (v[mid] == key) {
        res = mid;
        start = mid + 1;

      } else if (key < v[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }
  public static void main(String args[]) {
    int n = 7;
    int key = 13;
    int[] v = {3,4,13,13,13,20,40};

    // returning the last occurrence index if the element is present otherwise -1
    System.out.println(solve(n, key, v));
  }
}

//Time Complexity: O(log n)
//Space Complexity: O(1)
