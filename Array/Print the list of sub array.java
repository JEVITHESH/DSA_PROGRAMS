public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5};
	 
	    for(int i = 0 ; i < arr.length ; i++){
	        for(int j = i ; j < arr.length;j++){
	            for(int z = i ; z < j ; z++){
	            	System.out.print(arr[z] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	}
}
