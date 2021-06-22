// Worst case Time Complexity - O(n)

public class PeakElementNaive {
    
    static int findPeakElement(int arr[]){
        int n = arr.length;
        if(n == 1) 
            return arr[0];
        if(arr[0] >= arr[1])
            return arr[0];
        if(arr[n-1] >= arr[n-2])
            return arr[n-1];
        for(int i = 1; i < n-1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {6,7,8,20,12};
        System.out.println(findPeakElement(arr));
    }

}
