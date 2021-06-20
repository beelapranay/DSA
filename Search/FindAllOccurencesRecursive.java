public class FindAllOccurencesRecursive {

    static int findFirstOccurence(int arr[], int num, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] > num)
            return findFirstOccurence(arr, num, low, mid - 1);
        else if(arr[mid] < num)
            return findFirstOccurence(arr, num, mid + 1, high);
        else{
            if(mid == 0 || arr[mid - 1] != arr[mid])
                return mid;
            else
                return findFirstOccurence(arr, num, low, mid - 1);
        }
    }

    static int findLastOccurence(int arr[], int num, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] > num)
            return findLastOccurence(arr, num, low, mid - 1);
        else if(arr[mid] < num)
            return findLastOccurence(arr, num, mid + 1, high);
        else{
            if(mid == 0 || arr[mid + 1] != arr[mid])
                return mid;
            else
                return findLastOccurence(arr, num, mid + 1, high);
        }
    }

    static int findAllOccurences(int arr[], int num, int low, int high){
        int first = findFirstOccurence(arr, num, low, high);
        if(first == -1)
            return 0;
        else{
            return (findLastOccurence(arr, num, low, high) - first + 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,2,5,5,5,6,7};
        int num = 5;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(findAllOccurences(arr, num, low, high));
    }

}