public class IndexFirstOccurenceIterative {
    
    static int findFirstOccurence(int arr[], int num, int low, int high){
        int mid = (low + high)/2;
        while(low <= high){
            if(arr[mid] < num){
                low = mid + 1;
            }
            else if(arr[mid] > num){
                high = mid - 1;
            }
            else{
                if(arr[mid] == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {45,67,89,89,543,90};
        int num = 89;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(findFirstOccurence(arr, num, low, high));;
    }
}
