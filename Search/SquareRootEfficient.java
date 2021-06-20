public class SquareRootEfficient {
    
    static int findSquareRoot(int x){
        int ans = -1, low = 1, high = x;
        while(low <= high){
            int mid = (low + high)/2;
            int midSq = mid * mid;
            if(midSq == x)
                return mid;
            else if(midSq > x)
                high = mid - 1;
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int x = 19;
        System.out.println(findSquareRoot(x));;
    }

}
