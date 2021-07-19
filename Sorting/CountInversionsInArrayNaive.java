// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class CountInversionsInArrayNaive {
    
    static int count(int a[]) {
        int res = 0;
        int m = a.length;
        for(int i = 0; i < (m - 1); i++) {
            for(int j = (i + 1); j < m; j++) {
                if(a[i] > a[j])
                    res++;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = {2, 4, 1, 3, 5};
        System.out.println(count(a));
    }

}
