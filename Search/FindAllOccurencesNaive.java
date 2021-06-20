public class FindAllOccurencesNaive{
    static int findAllOccurences(int arr[], int num){
        int x = 0;
        for(int  i = 0; i < arr.length; i++){
            if(arr[i] == num){
                x += 1;
            }
        }
        if(x > 0){
            return x;
        }
        else
            return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,5,5,5};
        int num = 5;
        System.out.println(findAllOccurences(arr, num));
    }
}