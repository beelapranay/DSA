// Time Complexity: O(m+n)
// Auxiliary Space: O(1) - Inplace

public class MergeTwoSortedArraysEfficient {

    static void mergeArrays(int a[], int b[]) {
        int i = 0, j = 0;
        int m = a.length;
        int n = b.length;

        while(i < m && j < n) {
            if(a[i] <= b[j]) {
                System.out.println(a[i]);
                i++;
            }
            else {
                System.out.println(b[j]);
                j++;
            }
        }

        while(i < m) {
            System.out.println(a[i]);
            i++;
        }

        while (j < n) {
            System.out.println(b[j]);
            j++;
        }
    }

    public static void main(String args[]) {
        int a[] = { 10, 15, 20, 20 };
        int b[] = { 1, 12 };
        mergeArrays(a, b);
    }

}