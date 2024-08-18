//Naive Approach (Brute-force):

            import java.util.*;

            public class tUf {
                public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
                    ArrayList<Integer> arr3 = new ArrayList<>();
            
                    // apply the merge step:
                    int i = 0, j = 0;
                    while (i < m && j < n) {
                        if (a.get(i) < b.get(j)) arr3.add(a.get(i++));
                        else arr3.add(b.get(j++));
                    }
            
                    // copy the left-out elements:
                    while (i < m) arr3.add(a.get(i++));
                    while (j < n) arr3.add(b.get(j++));
            
                    return arr3.get(k - 1);
                }
            
                public static void main(String[] args) {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);
            
                    ArrayList<Integer> b = new ArrayList<>();
                    b.add(1); b.add(4); b.add(8); b.add(10);
            
                    System.out.println("The k-th element of two sorted arrays is: " +
                                        kthElement(a, b, a.size(), b.size(), 5));
                }
            }
        
        
        
//Time Complexity: O(m+n), where m and n are the sizes of the given arrays. Reason: We traverse through both arrays linearly.
//Space Complexity: O(m+n), where m and n are the sizes of the given arrays. Reason: We are using an extra array of size (m+n) to solve this problem.

//Better Approach (Optimized space):

import java.util.*;

public class Main {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        int ele = -1;
        int cnt = 0; //counter
        // apply the merge step:
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a.get(i) < b.get(j)) {
                if (cnt == k - 1) ele = a.get(i);
                cnt++;
                i++;
            } else {
                if (cnt == k - 1) ele = b.get(j);
                cnt++;
                j++;
            }
        }

        // copy the left-out elements:
        while (i < m) {
            if (cnt == k - 1) ele = a.get(i);
            cnt++;
            i++;
        }
        while (j < n) {
            if (cnt == k - 1) ele = b.get(j);
            cnt++;
            j++;
        }

        return ele;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(4); b.add(8); b.add(10);

        System.out.println("The k-th element of two sorted arrays is: " +
                            kthElement(a, b, a.size(), b.size(), 5));
    }
}

//Time Complexity: O(m+n), where m and n are the sizes of the given arrays. Reason: We traverse through both arrays linearly.
//Space Complexity: O(1), as we are not using any extra space to solve this problem.

//Optimal Approach (Using Binary Search):

import java.util.*;

public class tUf {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        if (m > n) return kthElement(b, a, n, m, k);

        int left = k; // length of left half

        // apply binary search:
        int low = Math.max(0, k - n), high = Math.min(k, m);
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            // calculate l1, l2, r1, and r2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < m) r1 = a.get(mid1);
            if (mid2 < n) r2 = b.get(mid2);
            if (mid1 - 1 >= 0) l1 = a.get(mid1 - 1);
            if (mid2 - 1 >= 0) l2 = b.get(mid2 - 1);

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }

            // eliminate the halves:
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; // dummy statement
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(4); b.add(8); b.add(10);

        System.out.println("The k-th element of two sorted arrays is: " +
                            kthElement(a, b, a.size(), b.size(), 5));
    }
}
        
//Time Complexity: O(log(min(m, n))), where m and n are the sizes of two given arrays. Reason: We are applying binary search on the range [max(0, k-n2), min(k, n1)]. The range length <= min(m, n).
//Space Complexity: O(1), as we are not using any extra space to solve this problem.
