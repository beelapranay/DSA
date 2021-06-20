public class SquareRootNaive {
    
    static int findSquareRoot(int x){
        int i = 1;
        while(i*i <= x)
            i++;
        return (i-1);
    } 

    public static void main(String args[]) {
        int x = 19;
        System.out.println(findSquareRoot(x));
    }

}
