public class IntersectionofTwoSortedArraysEfficient {
    
    static void intersection(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int i = 0, j =0;
        
        while (i < m && j < n) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        int b[] = { 5, 10, 10, 15, 30 };
        intersection(a, b);
    }

}
