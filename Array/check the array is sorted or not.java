public class Main
{
	public static void main(String[] args) {
	    boolean a = true;
		int[] arr = {3,4,12,36,77};
	    for(int i = 1 ; i<arr.length ; i++){
	        if(arr[i-1] > arr[i]){
	            a = false;
	        }
	    }
	    System.out.println(a);
	}
}
