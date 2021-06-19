public class IndexLastOccurenceRecursive {
    static int findLastOccurence(int arr[], int num, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] < num)
            return findLastOccurence(arr, num, mid + 1, high);
        else if(arr[mid] > num)
            return findLastOccurence(arr, num, low, mid - 1);
        else{
            if(mid == arr.length - 1 || arr[mid + 1] != arr[mid]){
                return mid;
            }
            else{
                return findLastOccurence(arr, num, mid + 1, high);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {45,67,89,89,89,543};
        int num = 89;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(findLastOccurence(arr, num, low, high));
    }
}
