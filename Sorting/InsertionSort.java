// Time Complexity:
    // Best Case (when array is sorted): Θ(n)
    // Worst Case (when the array is reverse sorted): Θ(n^2)
    // Generally: O(n^2)
// Auxiliary Space: O(1)

public class InsertionSort {
    
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 50,40,30,20,10,0 };
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
