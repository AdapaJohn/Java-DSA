import java.util.*;
class CombinationSumII {
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    public static void main(String args[]) {
        int v[]={10,1,2,7,6,1,5};
        List < List < Integer >> comb = combinationSum2(v, 8);
        System.out.println(comb.toString().replace(",", " "));
    }
}

//Time Complexity:O(2^n*k)  Reason: Assume if all the elements in the array are unique then the no. of subsequence you will get will be O(2^n). we also add the ds to our ans when we reach the base case that will take “k”//average space for the ds.
//Space Complexity:O(k*x)  Reason: if we have x combinations then space will be x*k where k is the average length of the combination.
