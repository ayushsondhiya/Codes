//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        for(int i : hs.keySet()){
            int key = hs.get(i);
            if(key > 1){
                list.add(i);
            }
        }
        if(list.size() == 0 ) list.add(-1);
        Collections.sort(list);
        return list;
        //sanju
    }
}


