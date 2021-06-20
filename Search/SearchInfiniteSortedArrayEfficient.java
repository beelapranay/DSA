public class SearchInfiniteSortedArrayEfficient {

    static int binarySearch(int arr[], int num, int low, int high){
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
    
    static int findElement(int arr[], int num){
        if(arr[0] == num) 
            return 0;
        int i = 1;
        while(arr[i] < num)
            i *= 2;
        if(arr[i] == num)
            return i;
        return binarySearch(arr, num, i/2 + 1, i - 1);
    }

    public static void main(String args[]) {
        int arr[] = {1,10,15,20,40,60,80,100,200,500,1000};
        int num = 100;
        System.out.println(findElement(arr, num));;
    }

}
