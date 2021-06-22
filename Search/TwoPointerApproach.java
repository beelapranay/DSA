// This approach is only viable for a sorted array
// Time Complexity - O(n); Auxiliary Space - O(1)

public class TwoPointerApproach {

    static String findPair(int arr[], int x){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == x)
                return "Yes";
            if(x < sum)
                high -= 1;
            else if(x > sum)
                low += 1;
        }
        return "No";
    }

    public static void main(String args[]) {
        int arr[] = {2,4,8,9,11,12,20,30};
        int x = 20;
        System.out.println(findPair(arr, x));
    }

}
