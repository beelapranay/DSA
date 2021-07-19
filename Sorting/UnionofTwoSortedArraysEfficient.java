// Time Complexity: O(m + n)
// Space Complexity: O(1)

public class UnionofTwoSortedArraysEfficient {
    
    static void union(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;

        while(i < m && j < n) {
            if(i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }   
            if(a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }
            else if(b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            }
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while(i < m) {
            if(i == 0 || a[i - 1] != a[i]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while (j < n) {
            if (j == 0 || b[j - 1] != b[j]) {
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 20 };
        int b[] = { 5, 20, 40, 40 };
        union(a, b);
    }

}
