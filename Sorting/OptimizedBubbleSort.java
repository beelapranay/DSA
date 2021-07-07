public class OptimizedBubbleSort {
    
    static void bubbleSort(int arr[], int n) {
        Boolean swapped;
        for (int i = 0; i < n; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,6,4,3,1};
    bubbleSort(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
