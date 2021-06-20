// O(position) => Time Complexity
// O(1) => Auxiliary Space

public class SearchInfiniteSortedArrayNaive {
    
    static int findElement(int arr[], int x){
        int i = 0;
        while(true){
            if(arr[i] == x) return i;
            else if(arr[i] > x)  return -1;
            i++;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int x = 4;
        System.out.println(findElement(arr, x));;
    }

}
