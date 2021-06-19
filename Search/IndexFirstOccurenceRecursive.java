public class IndexFirstOccurenceRecursive {

    public static int findFirstOccurence(int arr[], int num, int high, int low) {
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(num > arr[mid])
            return findFirstOccurence(arr, num, high, mid + 1);
        else if(arr[mid] > num)
            return findFirstOccurence(arr, num, mid - 1, low);
        else{
            if(mid == 0 || arr[mid-1] != arr[mid])
                return mid;
            else
                return findFirstOccurence(arr, num, mid - 1, low);
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {45,67,89,89,543,90};
        int low = 0;
        int high = arr.length - 1;
        System.out.println(findFirstOccurence(arr, 89, high, low));;
    }
}