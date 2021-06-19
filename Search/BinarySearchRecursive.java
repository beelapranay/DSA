// Recursive Binary Search in a sorted array 
// Time Complexity - O(Log N)

public class BinarySearchRecursive {
    
    public static int findNumber(int arr[], int num, int high, int low){

        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;
        if(num == arr[mid]){
            return mid;
        }

        else if(num < arr[mid]){
            return findNumber(arr, num, mid-1, low);
        }

        else {
            return findNumber(arr, num, high, mid+1);
        }
    }

    public static void main(String args[]) {
        int arr[] = {10,15,16,20,25,29};
        int num = 100;
        int high = arr.length - 1;
        int low = 0;
        System.out.println(findNumber(arr, num, high, low));;
    }
}
