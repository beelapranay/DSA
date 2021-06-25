public class RepeatingElement {
    
    static int findRepeatingElement(int arr[]){
        int n = arr.length;
		boolean visited[] = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			if(visited[arr[i]])
				return arr[i];
			visited[arr[i]] = true;
		}
		return -1;
	}

    public static void main(String args[]) {
        int arr[] = {0,2,1,3,2,2};
        System.out.println(findRepeatingElement(arr));
    }
}
