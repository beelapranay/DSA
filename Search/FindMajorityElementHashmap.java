public class FindMajorityElementHashmap {

    static int findMajorityElement(int arr[]){
        int n = arr.length;
        int count = n / 2;
        int res = 0;
        int elementCount = 1;
        
        for(int i = 1; i < n; i++){
            if(arr[res] == arr[i])
                elementCount++;
            else
                elementCount--;
            if(elementCount == 0){
                res = i;
                elementCount = 1;
            }
        }

        elementCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[res] == arr[i])
                elementCount++;
        }
        if(elementCount <= count)
            res = -1;
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {6,8,4,8,8};
        System.out.println(findMajorityElement(arr));;
    }
}
