public class FindAllOccurencesIterative {
    
    static int findFirstOccurence(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(num < arr[mid]){
                high = mid - 1;
            }
            else if(num > arr[mid]){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    static int findLastOccurence(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(num < arr[mid]){
                high = mid - 1;
            }
            else if(num > arr[mid]){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid + 1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    static int findAllOccurences(int arr[], int num, int low, int high){
        int first = findFirstOccurence(arr, num, low, high);
        if(first == -1)
            return 0;
        else
            return (findLastOccurence(arr, num, low, high) - first + 1);
    }

    public static void main(String args[]) {
        int arr[] = {1,2,5,5,5,6,7};
        int num = 5;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(findAllOccurences(arr, num, low, high));
    }

}
