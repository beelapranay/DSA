public class IndexLastOccurenceIterative {
    
    static int findLastOccurence(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] < num){
                low = mid + 1;
            }
            else if(arr[mid] > num){
                high = mid - 1;
            }
            else{
                if(mid == arr.length-1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {45,67,89,89,89,543};
        int low = 0;
        int high = arr.length - 1;
        int num = 543;
        System.out.println(findLastOccurence(arr, num, low, high));
    }

}
