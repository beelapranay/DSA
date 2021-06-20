// 0s and 1s only so only < and = cases

public class Count1SortedArray {
    
    static int find1s(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == 0)
                low = mid + 1;
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid])
                    return (arr.length - mid);
                else
                    high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = {0,0,0,1,1,1,1};
        int num = 1;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(find1s(arr, num, low, high));
    }

}
