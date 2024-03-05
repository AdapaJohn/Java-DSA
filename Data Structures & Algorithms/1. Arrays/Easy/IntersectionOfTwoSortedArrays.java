//Brute Force Approach

import java.util.*;

class IntersectionOfTwoSortedArrays {

public static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B){
    
    ArrayList<Integer> ans=new ArrayList<>();

  // to maintain visited 
  int visited[]=new int[B.length]; 
 
  for (int i = 0; i < A.length; i++) {
    for (int j = 0; j < B.length; j++) {

      if (A[i] == B[j] && visited[j] == 0) { 
    
        //if element matches and has not been matched with any other before
        ans.add(B[j]);
        visited[j] = 1;

        break;
      } else if (B[j] > A[i]) break; 
       //because array is sorted , element will not be beyond this
    }
  }
  return ans;
}    

public static void main(String args[]) 
{
  // Array Initialisation.
  int A[]= {1,2,3,3,4,5,6,7};
  int B[]= {3,3,4,4,5,8};

  ArrayList<Integer> ans= intersectionOfArrays(A,B);
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}

//Time Complexity: O(n1 x n2) ~ O(n^2) { There are nested loops where the outer one loops n1 times and the inner one loops n2 times, where n1 = A.size() and n2 = B.size() }.
//Space Complexity: O(n) { Extra Space used for the visited and ans arrays }.

//2 Pointer approach

import java.util.*;

class IntersectionOfTwoSortedArrays {

public static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B){
    
   // Declare ans array.
   ArrayList<Integer> ans=new ArrayList<>();

  int i = 0, j = 0; 

  // to traverse the arrays
  while (i < A.length && j < B.length) {
      
    //if current element in i is smaller
    if (A[i] < B[j]) { 
      i++;
    } else if (B[j] < A[i]) {
      j++;
    } else {
    
      //both elements are equal
      ans.add(A[i]);
      i++;
      j++;
    }
  }
  return ans;
}    

public static void main(String args[]) 
{
  // Array Initialisation.
  int A[]= {1,2,3,3,4,5,6,7};
  int B[]= {3,3,4,4,5,8};

  ArrayList<Integer> ans= intersectionOfArrays(A,B);
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}

//Time Complexity: O(n) { Since the elements are compared within the single pass for both the arrays this approach would take a linear time and in the worst case O(n1+n2) where n1 = A.size() and n2 = B.size() }.
//Space Complexity: O(1) { There is no extra space used in the two-pointers approach }.
