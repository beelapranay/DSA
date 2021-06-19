// Iterative Binary Search in a sorted array
// Time Complexity - O(Log N)

public class BinarySearchIterative{

    public static int findNumber(int[] arr, int num){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == num){
                return mid;
            }
    
            else if(arr[mid] > num){
                high = mid - 1;
            }
    
            else if(arr[mid] < num){
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        int num = 6;
        System.out.println(findNumber(arr, num));;
    }
}