// Time Complexity: O((m + n) log (m + n))
// Space Complexity: O(m + n)

import java.util.Arrays;

public class UnionofTwoSortedArraysNaive {

    static void union(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int arr[] = new int[m + n];

        for(int i = 0; i < m; i++) {
            arr[i] = a[i];
        }

        for(int i = 0; i < n; i++) {
            arr[m + i] = b[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < (m + n); i++) {
            if(i == 0 || arr[i] != arr[i - 1]) 
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = {10, 20, 20};
        int b[] = {5, 20, 40, 40};
        union(a, b);
    }

}